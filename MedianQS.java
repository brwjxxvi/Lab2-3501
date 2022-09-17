import java.util.Random;

public class MedianQS {
    
    public static int partition (TestInteger[]TI, int lo, int hi) {
        Random rand = new Random();
        TestInteger sub1 = new TestInteger(rand.nextInt(hi-lo) + lo);
        TestInteger sub2 = new TestInteger(rand.nextInt(hi-lo) + lo);
        TestInteger sub3 = new TestInteger(rand.nextInt(hi-lo) + lo);
        TestInteger median = new TestInteger(TI[lo].value);    
        if (sub1.compareTo(sub2) == 1 && sub1.compareTo(sub3) == -1 || sub1.compareTo(sub2) == 1 && sub1.compareTo(sub3) == -1 ) {
            median = sub1;
        }
        if (sub2.compareTo(sub1) == 1 && sub2.compareTo(sub3) == -1 || sub2.compareTo(sub3) == 1 && sub2.compareTo(sub1) == -1 ) {
            median = sub2;
        } else
        median = sub3;

        while (lo < hi){
            while (lo < hi && TI[hi].compareTo(median)>=0) --hi;
            TI[lo].value=TI[hi].value;             
            while (lo < hi && TI[lo].compareTo(median)<=0) ++lo;
            TI[hi].value = TI[lo].value;          
        }
        TI[lo].value = median.value;
        return lo;
    }

    private static void qSort (TestInteger[]TI, int lo, int hi) {
        if (lo >= hi || lo < 0) {
            return;
        } 

        int pivot = partition(TI, lo, hi);

        qSort(TI, lo, pivot-1);
        qSort(TI, pivot+1, hi);
    }

    public static void quickSort(TestInteger[]TI){
        qSort(TI, 0, TI.length-1);
    }
}

    // public int partition(int[] arr, int left, int right) {
    //     int mid=left+(right-left)/2;
    //     getThreeMid(arr,left,mid,right);
    //     int base = arr[right];
    //     int p = left - 1;
    //     for (int i = left; i < right; i++) {
    //         if (arr[i] <= base) {
    //             p++;
    //             exchange(arr,p,i);
    //         }
    //     }
    //     p++;
    //     exchange(arr,p,right);
    //     return p;
    // }

    // public void getThreeMid(int[] arr,int left,int mid,int right){
    //     if(arr[left]>arr[right])
    //         exchange(arr,left,right);
    //     if(arr[mid]<arr[right])
    //     {
    //         if(arr[mid]>arr[left])
    //             exchange(arr,mid,right);
    //         else
    //             exchange(arr,left,right);
    //     }
    // }
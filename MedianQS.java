import java.util.Random;

public class MedianQS {
    
    public static int partition (TestInteger[]TI, int lo, int hi) {
        Random rand = new Random();
        TestInteger sub1 = new TestInteger(TI[rand.nextInt(hi-lo) + lo].value);
        TestInteger sub2 = new TestInteger(TI[rand.nextInt(hi-lo) + lo].value);
        TestInteger sub3 = new TestInteger(TI[rand.nextInt(hi-lo) + lo].value);
        TestInteger median = new TestInteger();    
        if (sub1.compareTo(sub2) >= 0 && sub1.compareTo(sub3) <= 0) {
            median = sub1;
        }
        if (sub2.compareTo(sub1) >= 0 && sub2.compareTo(sub3) <= 0) {
            median = sub2;
        } else if(sub3.compareTo(sub1) >= 0 && sub3.compareTo(sub2) <= 0){
                median = sub3;
        }


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

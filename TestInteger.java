import java.util.Arrays;

public class TestInteger implements Comparable<TestInteger> {

    private int value;
    public static int counter;

    public int[] arr;


    public int compareTo (TestInteger other) {
        counter++;

        if (other.value>this.value) {
            return -1;
        } else if (other.value==this.value) {
            return 0;
        } else {
            return 1;
        }
    }


    public static int partition (int[] arr, int lo, int hi) {
        int pivot = arr[lo];     
        while (lo < hi){
            while (lo < hi && arr[hi] >= pivot) --hi;
            arr[lo]=arr[hi];             
            while (lo < hi && arr[lo] <= pivot) ++lo;
            arr[hi] = arr[lo];          
        }
        arr[lo] = pivot;
        return lo;
    }

    private static void qSort (int[] arr, int lo, int hi) {
        if (lo >= hi || lo < 0) {
            return;
        } 

        int pivot = partition(arr, lo, hi);

        qSort(arr, lo, pivot-1);
        qSort(arr, pivot+1, hi);
    }

    public static void quickSort(int[]arr){
        qSort(arr, 0, arr.length-1);
    }

    public static void main (String[] args) {

        TestInteger[] arr = new TestInteger[100];

        for(int i = 0; i<arr.length; i++){
            arr[i] = new TestInteger((int) Math.random()*100);
        }
        //Integer b = 6;
        //String as = Arrays.toString(a.arr);
        //String bs = Arrays.toString(b.arr);
        System.out.print(Arrays.toString(arr));
    }
    
}

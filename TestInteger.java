import java.util.Arrays;

public class TestInteger implements Comparable<TestInteger> {

    private int value;
    public static int counter;

    public int[] arr;

    public TestInteger(int i) {
    }

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
        int pivot = arr[hi];
        int i = lo - 1;

        for (int j=0; lo < j && j < hi-1; j++) {
            
            if (arr[j] <= pivot) {
                i = i + 1;
                arr[i] = arr[j];
            }

        }

        i = i + 1;
        arr[i] = arr[hi];
        return i;
    }

    private static void quickSort (int[] arr, int lo, int hi) {
        if (lo >= hi || lo < 0) {
            return;
        } 

        int pivot = partition(arr, lo, hi);

        quickSort(arr, lo, pivot-1);
        quickSort(arr, pivot+1, hi);
    }

    public static void qSort(int[]arr){
        quickSort(arr, 0, arr.length-1);
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

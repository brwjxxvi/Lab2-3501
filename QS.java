public class QS {
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
}

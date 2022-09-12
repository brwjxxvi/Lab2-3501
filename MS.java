public class MS {
    public static void mergeSort(int[] arr){
        int[] temp =new int[arr.length];
        internalMergeSort(arr, temp, 0, arr.length-1);
    }
    private static void internalMergeSort(int[] arr, int[] temp, int left, int right){
        //When left==right，there is no need for partition. 
        if (left<right){
            int middle = (left+right)/2;
            internalMergeSort(arr, temp, left, middle);          //left sub arr
            internalMergeSort(arr, temp, middle+1, right);       //right sub arr
            mergeSortedArray(arr, temp, left, middle, right);    //merge the two sub arr
        }
    }
    // Merge two ordered subsequences
    private static void mergeSortedArray(int arr[], int temp[], int left, int middle, int right){
        int i=left;      
        int j=middle+1;
        int k=0;
        while (i<=middle && j<=right){
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i <=middle){
            temp[k++] = arr[i++];
        }
        while ( j<=right){
            temp[k++] = arr[j++];
        }
        //Copy the data back to the original array
        for (i=0; i<k; ++i){
            arr[left+i] = temp[i];
        }
    }
}
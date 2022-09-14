public class TS {
    public static void sort(Object[] a) {
        if (LegacyMergeSort.userRequested)
          legacyMergeSort(a);
      else
        ComparableTimSort.sort(a, 0, a.length, null, 0, 0);
    }
     
    public static <T> void sort(T[] a, Comparator<? super T> c) {
        if (c == null) {
            sort(a);
      } else {
            if (LegacyMergeSort.userRequested)
                legacyMergeSort(a, c);
        else
           TimSort.sort(a, 0, a.length, c, null, 0, 0);
        }
    }
     
    /** To be removed in a future release. */
     private static <T> void legacyMergeSort(T[] a, Comparator<? super T> c) {
      T[] aux = a.clone();
      if (c==null)
          mergeSort(aux, a, 0, a.length, 0);
      else
        mergeSort(aux, a, 0, a.length, 0, c);
      }
}
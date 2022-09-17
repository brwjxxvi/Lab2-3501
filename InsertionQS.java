public class InsertionQS {
    
    public static int partition (TestInteger[]TI, int lo, int hi) {
        TestInteger pivot = new TestInteger(TI[lo].value);     
        while (lo < hi){
            while (lo < hi && TI[hi].compareTo(pivot)>=0) --hi;
            TI[lo].value=TI[hi].value;             
            while (lo < hi && TI[lo].compareTo(pivot)<=0) ++lo;
            TI[hi].value = TI[lo].value;          
        }
        TI[lo].value = pivot.value;
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
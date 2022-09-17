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

    public static void qSort(TestInteger[]TI, int lo, int hi) {
        if (hi - lo + 1 > 20) {
            int pivot = partition(TI, lo, hi);
            qSort(TI, lo, pivot - 1);
            qSort(TI, pivot + 1, hi);
        }else{
            insertSort(TI, lo, hi);
        }
    }

    public static void quickSort(TestInteger[]TI){
        qSort(TI, 0, TI.length-1);
    }
    


    public static void insertSort(TestInteger[]TI, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            TestInteger pivot = new TestInteger(TI[i].value);
            int j = i - 1;
            for (; j >= lo; j--) {
                if (TI[j].compareTo(pivot)>=0) {
                    TI[j+1].value=TI[j].value;
                } else
                    break;
            }
            TI[j+1].value=pivot.value;
        }
    }
}

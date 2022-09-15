public class RandomQS {

    private static void qSort (TestInteger[]TI, int lo, int hi) {
        if (lo >= hi || lo < 0) {
            return;
        } 

        int pivot = (int) (Math.random()*hi);

        qSort(TI, lo, pivot-1);
        qSort(TI, pivot+1, hi);
    }

    public static void quickSort(TestInteger[]TI){
        qSort(TI, 0, TI.length-1);
    }
}
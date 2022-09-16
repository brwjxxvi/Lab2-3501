public class RandomQS {

    private static void RqSort (TestInteger[]TI, int lo, int hi) {
        if (lo >= hi || lo < 0) {
            return;
        } 

        int pivot = (int) (Math.random()*hi);

        RqSort(TI, lo, pivot-1);
        RqSort(TI, pivot+1, hi);
    }

    public static void quickSort(TestInteger[]TI){
        RqSort(TI, 0, TI.length-1);
    }
}
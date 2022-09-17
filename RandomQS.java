import java.util.Random;

public class RandomQS {

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
    
    public static int randomPartition (TestInteger[] TI, int lo, int hi) {
        Random rand = new Random();
        int pivot = (rand.nextInt(hi-lo) + lo);
        TI[pivot]=TI[hi];
        
        return partition(TI, lo, hi);
    }

    private static void qSort (TestInteger[]TI, int lo, int hi) {
        if (lo >= hi || lo < 0) {
            return;
        } 

        int pivot = randomPartition(TI, lo, hi);

        RqSort(TI, lo, pivot-1);
        RqSort(TI, pivot+1, hi);
    }

    public static void quickSort(TestInteger[]TI){
        RqSort(TI, 0, TI.length-1);
    }
}
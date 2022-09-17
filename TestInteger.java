import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class TestInteger implements Comparable<TestInteger> {

    public static int counter;

    public int value;

    TestInteger (int v){
        value = v;
    }

    public static void resetCounter(){
        counter = 0;
    }

    @Override
    public String toString() {
        return "" + this.value;
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


    public static void main (String[] args) {

        TestInteger[] QTI = new TestInteger[10000];
        TestInteger[] MTI = new TestInteger[10000];

        for(int i = 0; i<QTI.length; i++){
            QTI[i]= new TestInteger((int)(Math.random()*1000000));
        }
        for(int i = 0; i<MTI.length; i++){
            MTI[i] = new TestInteger(QTI[i].value);
        }
        
        //System.out.println(Arrays.toString(QTI));
        //System.out.println(Arrays.toString(MTI));
        RandomQS.quickSort(QTI);
        System.out.println(Arrays.toString(QTI));
        System.out.println("Quicksort comparisons: " + counter);
        resetCounter();

        Arrays.sort(MTI);
        //System.out.println(Arrays.toString(MTI));
        System.out.println("Timsort: " + counter);

        TestInteger[] IncreaseTI = new TestInteger[100]; 
        for(int i = 0; i<IncreaseTI.length; i++){
            IncreaseTI[i] = new TestInteger(ThreadLocalRandom.current().nextInt (1, 102));
        }
        //System.out.println(Arrays.toString(IncreaseTI));
            
        
    }
    
}

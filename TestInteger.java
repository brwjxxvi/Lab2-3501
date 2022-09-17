import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class TestInteger implements Comparable<TestInteger> {

    public static int counter;

    public int value;

    TestInteger (){}

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

        //First Step: generate array.
        TestInteger[] QTI = new TestInteger[100];
        TestInteger[] MTI = new TestInteger[100];
        TestInteger[] IncreaseTI = new TestInteger[1000];
        TestInteger[] DecreaseTI = new TestInteger[1000];  
        for(int i = 0; i<QTI.length; i++){
            QTI[i]= new TestInteger((int)(Math.random()*100));
        }
        for(int i = 0; i<MTI.length; i++){
            MTI[i] = new TestInteger(QTI[i].value);
        }
        for(int i = 0; i<1000; i++){
            IncreaseTI[i] = new TestInteger(i+1);
        }
        for(int i = 0; i<1000; i++){
            DecreaseTI[i] = new TestInteger(1000-i);
        }


        //Second Step: sorting and printing. 
            //Object 1
        System.out.println(Arrays.toString(QTI));
        //QS.quickSort(QTI);
        //RandomQS.quickSort(QTI);
        MedianQS.quickSort(QTI);
        //InsertionQS.quickSort(QTI);
        System.out.println(Arrays.toString(QTI));
        //System.out.println("Quicksort: " + counter);
        //System.out.println("RandomQuickSort: " + counter);
        System.out.println("MedianQuickSort: " + counter);
        //System.out.println("InsertionQuicksort: " + counter);
        resetCounter();

            //Object 2
        Arrays.sort(MTI);
        //System.out.println(Arrays.toString(MTI));
        System.out.println("Timsort: " + counter);

        //System.out.println(Arrays.toString(IncreaseTI));
            
        
    }
    
}

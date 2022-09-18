import java.util.Arrays;

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

    public static boolean isSorted(TestInteger[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].value > array[i + 1].value)
                return false;
        }
        return true;
    }


    public static void main (String[] args) {

        //First Step: generate array.
        TestInteger[] QTI = new TestInteger[10000];
        TestInteger[] MTI = new TestInteger[10000];

        TestInteger[] IncreaseTI = new TestInteger[1000];
        TestInteger start1 = new TestInteger((int)(Math.random()*1000));
        IncreaseTI[0] = start1;

        TestInteger[] DecreaseTI = new TestInteger[1000];  
        TestInteger start2 = new TestInteger((int)(Math.random()*1000));
        DecreaseTI[0] = start2;

        for (int i = 0; i<QTI.length; i++){
            TestInteger value = new TestInteger((int)(Math.random()*1000000));
            QTI[i] = value;
            MTI[i]= value;
        }

        for (int i = 0; i<QTI.length; i++){
            TestInteger value = new TestInteger((int)(Math.random()*1000000));
            MTI[i]= value;
        }

        for(int i = 1; i<IncreaseTI.length; i++){
            IncreaseTI[i] = new TestInteger(i+1);
        }

        for(int i = 0; i<DecreaseTI.length; i++){
            DecreaseTI[i] = new TestInteger(DecreaseTI.length-i);
        }


        //Second Step: sorting and printing. 
            //Object 1
        //System.out.println(Arrays.toString(DecreaseTI));
        RandomQS.quickSort(DecreaseTI);
        //System.out.println(Arrays.toString(IncreaseTI)); 

        System.out.println("Quicksort array sorted?: " + isSorted(DecreaseTI));
        System.out.println("Time: " + counter);
        
        resetCounter();

            //Object 2
        //System.out.println(Arrays.toString(tmp2));
        Arrays.sort(IncreaseTI);
        //System.out.println(Arrays.toString(tmp2));
        System.out.println("Timsort array sorted?: " + isSorted(IncreaseTI));
        System.out.println("Time: " + counter);

        //System.out.println(Arrays.toString(IncreaseTI));
            
        
    }
    
}

import java.util.Arrays;
import java.util.Arrays.Sort;

public class TestInteger implements Comparable<TestInteger> {

    public static int counter;

    public int value;

    TestInteger (){
    }

    TestInteger (int v){
        value = v;
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

        TestInteger[] TI = new TestInteger[100];

        for(int i = 0; i<TI.length; i++){
            TI[i]= new TestInteger((int)(Math.random()*1000000));
        }

        System.out.println(Arrays.toString(TI));
        //QS.quickSort(TI);
        Arrays.sort(TI);
        System.out.println(Arrays.toString(TI));
        System.out.println(counter);
        
    }
    
}

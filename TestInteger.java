import java.util.Arrays;
import MS.java;
import QS.java;

public class TestInteger implements Comparable<TestInteger> {

    public static int counter;

    private int value;

    TestInteger (){
    }

    TestInteger (int v){
        value = v;
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
            TI[i]= new TestInteger((int)(Math.random()*100));
            //TestInteger[i].value = (int)(Math.random()*100);
        }
        //Integer b = 6;
        //String as = Arrays.toString(a.arr);
        //String bs = Arrays.toString(b.arr);
        System.out.println(Arrays.toString(TI));

        QS.quickSort(TI);
        System.out.println(Arrays.toString(TI));
    }
    
}

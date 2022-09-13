import java.util.Arrays;

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
            TI[i]= new TestInteger((int)(Math.random()*100));
        }

        System.out.println(Arrays.toString(TI));
        QS.quickSort(TI);
        System.out.println(Arrays.toString(TI));
        System.out.println(counter);
        
    }
    
}

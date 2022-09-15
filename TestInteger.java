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

        TestInteger[] QTI = new TestInteger[100];
        TestInteger[] MTI = new TestInteger[100];

        for(int i = 0; i<QTI.length; i++){
            QTI[i]= new TestInteger((int)(Math.random()*100));
        }
        MTI = clone

        System.out.println(Arrays.toString(QTI));
        //QS.quickSort(TI);
        Arrays.sort(QTI);
        System.out.println(Arrays.toString(QTI));
        System.out.println(counter);
        
    }
    
}

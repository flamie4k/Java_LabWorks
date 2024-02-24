package Lab_12;
public class ExecuteEvenOddThread {
    public static void main(String[] args) {
        int[] numbers = {134, 5, 73, 32142, 81, 447};
        
        EvenThread et = new EvenThread(numbers);
        OddThread ot = new OddThread(numbers);
        
        et.start();
        ot.start();
    }
}

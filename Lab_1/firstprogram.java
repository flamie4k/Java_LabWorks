package Lab_1;
public class firstprogram {
        static int counter = 0;

        firstprogram() {
            counter++;
            System.out.println(counter);
        }

    public static void main(String[] args) {
        System.out.println("Welcome\n");
        firstprogram f1 = new firstprogram();
        firstprogram f2 = new firstprogram();
        firstprogram f3 = new firstprogram();
    }
}
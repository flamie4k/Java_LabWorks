package Lab_1;
import java.util.Scanner;
public class BasicJava {
    public static void main(String[] args) {
        System.out.print("Hello\n");
        System.out.print("Enter size of array: ");
        UserInput ui = new UserInput();
        ui.getArrayDetail();
        ui.display();
    }
}
class UserInput {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    void getArrayDetail() {
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    void display() {
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

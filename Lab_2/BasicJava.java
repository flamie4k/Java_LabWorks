package Lab_2;
import java.util.Scanner;

public class BasicJava {
    public static void main(String[] args) {
        ArithmeticOperation a = new ArithmeticOperation();
        a.getNumber();
        a.addNumber();
        a.diffNumbers();
    }
}

class ArithmeticOperation {
    int firstNumber, secondNumber;

    void getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = sc.nextInt();
    }

    void addNumber() {
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);
    }

    void diffNumbers() {
        int diff = secondNumber - firstNumber;
        System.out.println("Difference is " + diff);
    }
}

import java.util.Scanner;

public class Basic7 { // Arithmetic Operator , Type casting
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum, sub;
        double div;

        System.out.print("Enter First Number: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        sub = num1 - num2;
        div = (double) num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Sum: " + sub);
        System.out.print("Div: " + div);
    }
}

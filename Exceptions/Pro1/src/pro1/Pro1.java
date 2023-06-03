package pro1;

import java.util.Scanner;

public class Pro1 {

    public static void main(String[] args) {
        int count = 1;
        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter First number: ");
                int a = in.nextInt();
                System.out.print("Enter Second number: ");
                int b = in.nextInt();
                int c = a / b;
                System.out.println("Result : " + a + " / " + b + " = " + c);
                count = 2;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("You must entar integer.Please try Again");
            }

        } while (count == 1);
    }

}

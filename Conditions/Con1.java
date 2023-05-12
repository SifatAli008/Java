import java.util.Scanner;

public class Con1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int age = input.nextInt();
            if (age > 18) {
                System.out.println("Adult");
            } else {
                System.out.println("Not Adult");
            }
        }
    }

}
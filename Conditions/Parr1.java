import java.util.Scanner;

public class Parr1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              System.out.print("* ");
            }
            System.out.println( );
        }
    }
}

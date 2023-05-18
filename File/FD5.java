import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FD5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of faculty: ");
        int num = in.nextInt();

        try (Formatter formatter = new Formatter("E:/Java_VS/File/University/Teacher.txt")) {

            for (int i = 0; i < num; i++) {
                System.out.println("Enter "+(i+1)+" number faculty info.");

                System.out.print("Enter id : ");
                String id = in.next();

                System.out.print("Enter name : ");
                String name = in.next();

                formatter.format("%s %s\r\n", id, name);
                System.out.println(" ");
            }

            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        in.close();
    }
}

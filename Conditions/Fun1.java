import java.util.Scanner;

public class Fun1 {
    public static void printMyName(String name) {
        System.out.println(name);
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       String name = input.nextLine();

       printMyName(name);
    }
}

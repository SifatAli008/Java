import java.util.Scanner;

public class Basic6 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter any number: ");
        number = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        String name;

        System.out.print("Enter Your Name: ");
        name = input1.nextLine(); 


        System.out.println("Number = "+number);
        System.out.println("Welcome  "+name);
    }
}

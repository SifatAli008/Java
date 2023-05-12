import java.util.Scanner;

public class Str1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Firstname = input.nextLine();
        String Lastname = input.nextLine();
        String Fullname = Firstname + " " + Lastname ;
        System.out.println("Welcome "+Fullname );
        System.out.println(Fullname.length());
    }
}

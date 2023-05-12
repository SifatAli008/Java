import java.util.*;
public class Con2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int button = input.nextInt();

        switch(button){
            case 1 : System.out.println("Hello Cse");
             break;
             case 2 : System.out.println("Hello World");
             break;
             default: System.out.println("Invalid button");
        }
    }
}
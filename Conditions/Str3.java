import java.util.Scanner;

public class Str3 {// compare
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String name2 = input.nextLine();

        // if(name.compareTo(name2)== 0){
        // System.out.println("same");
        // }
        
        if (name == name2) {
            System.out.println("same");
        } else {
            System.out.println("Not same");
        }
    }
}

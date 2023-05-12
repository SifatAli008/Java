import java.util.Scanner;

public class Str4 {// substring
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String  sentence = input.nextLine();
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}

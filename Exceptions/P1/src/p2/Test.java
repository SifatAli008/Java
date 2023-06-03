package p2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        String name = "Sifat";
          //    String name = null;
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            System.out.println(name.charAt(n));
        }
        
        catch (Exception e) {
            System.out.println(e);
        }

    }

}

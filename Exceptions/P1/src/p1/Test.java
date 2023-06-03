package p1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        try {
            int c = a / b;
            System.out.println("Divided : "+c);
        }
        catch(ArithmeticException e ){
       //  catch(Exception e ){
           // System.out.println(e);
              System.out.println(e.toString());
           // System.out.println(e.getMessage());
        }
    }

}

import java.util.Scanner;

public class Fun2 {

    public static int Addition(int a, int b){
        int sum = a + b;
        return sum;
    }
     public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();
       int b = input.nextInt();
       int result = Addition(a, b);

       System.out.println(result);
     }   
}

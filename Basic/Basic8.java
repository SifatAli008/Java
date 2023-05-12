import java.util.Scanner;

public class Basic8 { //Assning 
    public static void main(String[] args){
   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of X: ");
        int x = input.nextInt();

        System.out.print("Enter the number of Y: ");
        int y = input.nextInt();
        
         x+=y;
         System.out.println("x : "+x);

         x-=y;//x=x-y
         System.out.println("x : "+x);

         x/=y;
         System.out.println("x : "+x);

         x*=y;
         System.out.println("x : "+x);
        
        
    }
}

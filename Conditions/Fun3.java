import java.util.Scanner;

public class Fun3 {
    public static int Fact(int n){
        int multi = 1;

    for(int i = n; i > 0; i--){
       multi = multi*i;
    }
       return multi;
}

  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int num = input.nextInt();

     int result = Fact(num);

     System.out.println(result);
  }

}

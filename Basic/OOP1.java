// TAKE A RANG M TO N AND PRINT EVEN NUMBERS
import java.util.*;
public class OOP1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();

        for(int i = M; i <=N; i++){
            if(i%2==0){
                System.out.println("Even : " + i);
            }
        }
    }
}
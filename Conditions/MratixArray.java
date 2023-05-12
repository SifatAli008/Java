import java.util.Scanner;

public class MratixArray {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      int marArr[][] = new int [size][size];

      for (int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
         marArr[i][j] = input.nextInt();
        }
        System.out.println();
   }

      for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            System.out.printf("%d ",marArr[i][j]);
        }
        System.out.println();
    }
 }
}
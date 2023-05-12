import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int marks[] = new int[size];


        for(int i = 0; i < size;  i++){
            marks[i] = input.nextInt();
        }
        
        for(int i = 0; i < size;  i++){
            System.out.println(marks[i]);
        }
    }
}

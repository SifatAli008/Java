import java.util.Scanner;

public class str5 {//string builder
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //String name = input.nextLine();

        StringBuilder sb = new StringBuilder(input.nextLine());

        //CHAR AT INDEX 0
       // System.out.println(sb.charAt(0));
        
        //SET CHAR at index 0
        sb.setCharAt(0, 'R');
        System.out.println(sb);



    }
}

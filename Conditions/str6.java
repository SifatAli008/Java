import java.util.Scanner;

public class str6 {//insert delete
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        StringBuilder str = new StringBuilder(input.nextLine());
        System.out.println(str);

        //insert
        str.insert(0, 'A');
        System.out.println(str);

        //delete
        str.delete(4,5);
        System.out.println(str);
    }
}

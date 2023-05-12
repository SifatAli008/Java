import java.util.Scanner;

public class str7 {
    public static  void main(String[] args){
    Scanner input = new Scanner(System.in);

    StringBuilder str = new StringBuilder(input.next());//h --> str = str + h;

    str.append(input.next());//e --> str = str + e;
    str.append(input.next());//l --> str = str + l;
    str.append(input.next());//l --> str = str + l;
    str.append(input.next());//o --> str = str + o;

    System.out.println(str);
    System.out.println(str.length());
    }
}

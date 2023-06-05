import java.util.ArrayList;

public class P4 {
    public static void main(String[] args) {
        ArrayList <Integer> number1 = new ArrayList<Integer>();
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);

        System.out.println("NUMBER 1 :"+number1);

        ArrayList <Integer> number2 = new ArrayList<Integer>();
        number2.add(10);
        number2.add(20);
        number2.add(30);
        number2.add(40);

        System.out.println("NUMBER 2 :"+number2);

        ArrayList <Integer> number3 = new ArrayList<Integer>();

        number3.addAll(number1);
        System.out.println("NUMBER 3 :"+number3);

        boolean result = number2.equals(number3);
       System.out.println("Number 2 Equals Number 3 : "+result);

       boolean result1 = number1.equals(number3);
       System.out.println("Number 1 Equals Number 3 : "+result1);

    }    
}

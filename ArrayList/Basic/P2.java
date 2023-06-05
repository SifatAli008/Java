import java.util.ArrayList;

public class P2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
    
        //adding with index number
         number.add(0, 50);
         number.add(1, 40);
         number.add(2, 30);
         System.out.println(number);

         //removwing all
         //number.removeAll(number);

        // Array List Empty
         boolean check = number.isEmpty();
         System.out.println("ArrayList Empty : "+check);
    }

}

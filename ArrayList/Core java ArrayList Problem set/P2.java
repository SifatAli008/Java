//Creating an ArrayList from another collection
import java.util.ArrayList;


public class P2 {
    public static void main(String[] args) {
        ArrayList <String> FirstFiveNumber = new ArrayList<String>();
        FirstFiveNumber.add("1");
        FirstFiveNumber.add("2");
        FirstFiveNumber.add("3");
        FirstFiveNumber.add("4");
        FirstFiveNumber.add("5");
        ArrayList <String> lastNumber = new ArrayList<String>(FirstFiveNumber);

        lastNumber.add("6");
        lastNumber.add("7");
        lastNumber.add("8");
        lastNumber.add("9");
        lastNumber.add("10");
        
        System.out.println(lastNumber);
        

    }
}

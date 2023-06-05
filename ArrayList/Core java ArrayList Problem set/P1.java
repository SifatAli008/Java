import java.util.ArrayList;

//Creating an ArrayList and adding new elements to it
public class P1{
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        list.add("Tiger");
        list.add("Cat");
        list.add("Dog");
        list.add("Cow");

       list.add(2,"Human");

       System.out.println(list);
    }    
}
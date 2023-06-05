import java.util.ArrayList;

//Removing elements from an ArrayList
public class P4 {
    public static void main(String[] args) {
        ArrayList <String> ProgrammingLangues = new  ArrayList <String>();

        
        ProgrammingLangues.add("C");
        ProgrammingLangues.add("C++");
        ProgrammingLangues.add("Java");
        ProgrammingLangues.add("JavaScript");
        ProgrammingLangues.add("Python");

        ProgrammingLangues.remove("JavaScript");

        System.out.println(ProgrammingLangues);
    }
}

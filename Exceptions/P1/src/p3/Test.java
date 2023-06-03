package p3;

public class Test {

    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result : " + result);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
       
        System.out.println("Last line of the programe");
    }

}

package p4;

public class Test {

    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result : " + result);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
          catch (ArithmeticException e1) {
            System.out.println(e1);
        }
        finally {
            System.out.println("Last line of the programe");
        }
    }

   

}

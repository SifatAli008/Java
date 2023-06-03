package p5;

public class Test {

    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result : " + result);
        } catch (ArithmeticException e1) {// first sub class
            System.out.println(e1);
        } catch (Exception e) {//then main class
            System.out.println(e);
        } finally {
            System.out.println("Last line of the programe");
        }
    }
}

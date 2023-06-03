package p6;

public class Test {

    public static void main(String[] args) {
        try {
            int[] a = new int[4];
            a[4] = 10;

        } catch (ArithmeticException e1) {// first sub class
            System.out.println(e1);
        } catch (Exception e) {//then main class
            System.out.println(e);
        } finally {
            System.out.println("Last line of the programe");
        }
    }
}

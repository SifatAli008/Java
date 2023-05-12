public class BitWiseOperator {
    public static void main(String[] args) {
        int a = 32;
        int b = 12;

        int c;

        c = a & b;//and
        System.out.println("a & b = " + c);

        c = a | b;//or
        System.out.println("a | b = " + c);

        c = a ^ b;//xor
        System.out.println("a ^ b = " + c);

        c = a>>2;//left shift
        System.out.println("a>>2 = " + c);

        c = a<<2;//right shift
        System.out.println("a<<2 = " + c);

        c = ~a;//Once complement
        System.out.println("~a = " + c);


    }
}

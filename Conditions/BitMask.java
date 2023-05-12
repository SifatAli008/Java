public class BitMask {
    public static void main(String[] args){
        int n = 5;
        int pos = 2;
        int BitMask = 1<<pos;

        if((BitMask & n)== 0){
            System.out.println("bit was Zero.");
        }
        else{
            System.out.println("bit was One.");

        }
    }
}

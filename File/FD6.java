import java.io.File;
import java.util.Scanner;
public class FD6 {
    public static void main(String[] args) {
       try{
           File file = new File("E:/Java_VS/File/University/Teacher.txt");
            Scanner in = new Scanner(file);

            while(in.hasNext()){
                String id = in.next();
                String name = in.next();
                System.out.println("Id :"+id+"\nName : "+name);
                System.out.println(" ");
            }

            in.close();
        }
       catch(Exception e){
        System.out.println(e);
       } 
    }
}

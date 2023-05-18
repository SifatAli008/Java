import java.io.FileNotFoundException;
import java.util.Formatter;

class FD4{
    public static void main(String[] args) {
     
        try (Formatter formatter = new Formatter("E:/Java_VS/File/University/Student.txt")) {
            formatter.format("%s %s\r\n","101","Halum");//variable type \return\newline, name 
            formatter.format("%s %s\r\n","102","Akil");
            formatter.format("%s %s\r\n","103","Sifat");
            formatter.close();
        }

    catch(FileNotFoundException e){
        System.out.println(e);
    }

  }
}
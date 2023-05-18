// file in a folder
import java.io.File;

public class FD2 {
    public static void main(String[] args) {
        
        File dir = new File("Person2");
        dir.mkdir();
        String path = dir.getAbsolutePath();

        File f1 = new File(path+"/Student.txt");
        File f2 = new File(path+"/Teacher.txt");

        try{
            f1.createNewFile();
            f2.createNewFile();
            System.out.println("File are created");
        }
        catch(Exception e){
            System.out.println(e);
        }

        if(f1.exists()){
         System.out.println("File exists");
        }

        // delet file

        // f2.delete();

        // if(f1.exists()){
        //     System.out.println("File exists");
        // }
        // else{
        //     System.out.println("File not exists"); 
        // }

    }
}

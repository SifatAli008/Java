import java.io.File;

public class FD1 {
    public static void main(String[] args) {
    
      File dir = new File("Person");//creating folder
   // File dir = new File("E:/Java_VS/File/FD1/Person1");
     dir.mkdir();
     
     String dirlocation = dir.getAbsolutePath();
     
        System.out.println(dirlocation);//get file location
        System.out.println(dir.getName());//get name
        
       // if(dir.delete( )){
        //  System.out.println(dir.getName()+" Folder has been deleted");
      //  }
    
    }
}

import java.io.File;

public class FD3 {
    public static void main(String[] args) {
        File od = new File("University");
        od.mkdir();
        
        String path = od.getAbsolutePath();

        File f1 = new File(path+"/Student.txt");
        File f2 = new File(path+"/Teacher.txt");

        try{
        f1.createNewFile();
        f2.createNewFile();
        System.out.println("New file created on: " + f1.getAbsolutePath());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

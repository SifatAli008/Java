package p3;

public class P3 {

    public static void main(String[] args) {
        
           Shape s[ ] = new Shape[3];
           
           s[0] = new Shape();
           s[1] = new Rectangle(10,20);
           s[2] = new Triangle (5,2);
           
           for(int i = 0;i<3;i++){
               
               System.out.println(s[i].area());
           }
     }
    
}

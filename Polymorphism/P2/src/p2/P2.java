package p2;

public class P2 {
    public static void main(String[] args) {
      Shape s1 = new Shape();
      Shape  s2 = new Rectangle(10,5);
      Shape s3 = new Triangle(2,5);
      
      s1.area();
      s2.area();
      s3.area();
    }
    
}

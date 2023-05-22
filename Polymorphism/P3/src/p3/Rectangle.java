package p3;

public class Rectangle extends Shape{
    
    double lenght, width;

    Rectangle(double lenght,double width) {
         this.lenght = lenght;
         this.width = width;
}
 
    @Override
    double area(){
        System.out.println("Area of Rectangle : ");
        return lenght*width;

    }
}

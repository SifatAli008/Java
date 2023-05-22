package p2;

public class Rectangle extends Shape{

    double lenght, width;

    Rectangle(double lenght,double width) {
         this.lenght = lenght;
         this.width = width;
}

 
    @Override
    void area(){
        System.out.println("Area of Rectangle : "+lenght*width);

    }
}
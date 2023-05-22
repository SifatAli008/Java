package p3;

public class Triangle extends Shape {
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

  

    @Override
    double area() {
        System.out.println("Area of Triangle : " );
        return .5 * base * height;
    }  
}

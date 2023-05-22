package p2;

public class Triangle extends Shape {

    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        System.out.println("Area of Triangle : " + .5 * base * height);
    }
}

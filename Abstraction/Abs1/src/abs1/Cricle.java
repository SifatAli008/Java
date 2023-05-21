package abs1;

public class Cricle extends Shape {

    public Cricle(double dim1) {
        super(dim1, dim1);
    }

    @Override
    void area() {
        double result = 3.1416 * dim1 * dim1;
        System.out.println("Triangle area : " + result);
    }
}

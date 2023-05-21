package abs1;

public class Test {

    public static void main(String[] args) {
        Shape shape;

        shape = new Rectangle(10, 2);
        shape.area();

        shape = new Triangle(10, 20);
        shape.area();

        shape = new Cricle(4);
        shape.area();
    }

}

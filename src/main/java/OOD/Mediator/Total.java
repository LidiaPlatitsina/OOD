package OOD.Mediator;

import OOD.Mediator.figure.*;

public class Total {
    public static void main(String[] args) {
        Square square = new Square(2);
        Triangle triangle = new Triangle(3,4,5);

        square.circle();
        triangle.circle();
    }
}

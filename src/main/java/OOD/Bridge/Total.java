package OOD.Bridge;

import OOD.Bridge.color.Blue;
import OOD.Bridge.color.Color;
import OOD.Bridge.color.Green;
import OOD.Bridge.color.Red;
import OOD.Bridge.figure.Circle;
import OOD.Bridge.figure.Rectangle;
import OOD.Bridge.figure.Square;


public class Total {
    public static void main(String[] args) {
        System.out.println("Цвет Красный:");
        testFigure(new Red());
        System.out.println("Цвет Синий:");
        testFigure(new Blue());
        System.out.println("Цвет Зелёный:");
        testFigure(new Green());
    }

    public static void testFigure(Color color)
    {
        System.out.println("Тест с кругом");
        Circle circle = new Circle(color);
        System.out.println(circle.getColor().getColor());

        System.out.println("Тест с квадратом");
        Square square = new Square(color);
        System.out.println(square.getColor().getColor());

        System.out.println("Тест с прямоугольником");
        Rectangle rectangle = new Rectangle(color);
        System.out.println(rectangle.getColor().getColor());
    }
}

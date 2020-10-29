package OOD.Mediator.mediator;

import OOD.Mediator.figure.Square;
import OOD.Mediator.figure.Triangle;

public class Mediator{
    private static Square square;
    private static Triangle triangle;

    public static double radiusRippedCircle(Square square) {
        return square.getSide()/2.0;
    }

    public static double radiusRippedCircle(Triangle triangle)
    {
        double p = (triangle.getSideA()+triangle.getSideB()+triangle.getSideC())/2.0;
        return Math.sqrt(((p-triangle.getSideA())*(p-triangle.getSideB())*(p-triangle.getSideC()))/p);
    }

    public static double radiusCircumscribedCircle(Square square) {
        return (square.getSide()*Math.sqrt(2))/2.0;
    }

    public static double radiusCircumscribedCircle(Triangle triangle){
        double p = (triangle.getSideA()+triangle.getSideB()+triangle.getSideC())/2.0;
        return (triangle.getSideA()*triangle.getSideB()*triangle.getSideC())/
                (4*Math.sqrt(p*(p-triangle.getSideA())*(p-triangle.getSideB())*(p-triangle.getSideC())));
    }
}

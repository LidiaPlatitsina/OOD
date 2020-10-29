package OOD.Mediator.figure;

import OOD.Mediator.mediator.Mediator;

public class Square {
    private int side;


    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void circle()
    {
        double result;
       result = Mediator.radiusCircumscribedCircle(new Square(side));
       System.out.println("Радиус описанной окружности для квадрата : ");
       System.out.format("%.2f\n",result);
        result =Mediator.radiusRippedCircle(new Square(side));
        System.out.println("Радиус вписанной окружности для квадрата : ");
        System.out.format("%.2f\n",result);
    }
}

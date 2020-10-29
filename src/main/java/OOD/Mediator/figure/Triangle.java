package OOD.Mediator.figure;

import OOD.Mediator.mediator.Mediator;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        if(sideA+sideB>sideC && sideA+sideC>sideB && sideB+sideC>sideA){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;}
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void circle()
    {
        double result;
        result = Mediator.radiusCircumscribedCircle(new Triangle(sideA,sideB,sideC));
        System.out.println("Радиус описанной окружности для треугольника : ");
        System.out.format("%.2f\n",result);
        result =Mediator.radiusRippedCircle(new Triangle(sideA,sideB,sideC));
        System.out.println("Радиус вписанной окружности для треугольника : ");
        System.out.format("%.2f\n",result);
    }
}

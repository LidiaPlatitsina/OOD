package OOD.Memento.circle;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void increaseRadiusBy(double num)
    {
        radius =radius+num;
    }

    public void decreaseRadiusBy(double num)
    {
        if(radius>num)
        {
            radius = radius-num;
        }
        else {System.out.println("Введино неправильное число");}
    }

    public void changeRadius(double rad)
    {
        if(rad>0){
            radius = rad;
        }
        else {
            System.out.println("Введён неправельный радиус");
        }
    }

    public void print()
    {
        System.out.print("Круг:");
        System.out.print(radius+"  "+"\n");
    }

    public double getRadius() {
        return radius;
    }
}

package OOD.Bridge.figure;

import OOD.Bridge.color.Color;

public class Circle implements Figure{
    private Color color;
    private Point center;
    private double radius;

    public Circle(Color color)
    {
        this.center = new Point();
        this.radius = 1;
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}

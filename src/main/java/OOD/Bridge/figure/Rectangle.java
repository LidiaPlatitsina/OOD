package OOD.Bridge.figure;

import OOD.Bridge.color.Color;

public class Rectangle implements Figure{
    private Point center;
    private int width;
    private int height;
    private Color color;

    public Rectangle(Color color)
    {
        this.center=new Point();
        this.width=1;
        this.height=2;
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

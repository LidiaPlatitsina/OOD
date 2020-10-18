package OOD.Bridge.figure;

import OOD.Bridge.color.Color;

public class Square implements Figure{
    private Color color;
    private Point center;
    private int length;

    public Square(Color color)
    {
        this.center=new Point();
        this.length=1;
        this.color= color;
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


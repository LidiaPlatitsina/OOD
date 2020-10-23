package OOD.Proxy.rectangles;

public class Rectangle implements IRectangle{
    private Point center;
    private int width;
    private int height;

    public Rectangle(Point center, int width, int height)
    {
        this.center=center;
        this.width=width;
        this.height=height;
    }

    public Rectangle() {

    }


    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public Point getCenter()
    {
        return center;
    }

    @Override
    public Rectangle moveTo(int x, int y)
    {
        return new Rectangle(center.moveTo(x,y),width,height);
    }

    @Override
    public Rectangle stretch(int xRatio, int yRatio)
    {
        return new Rectangle(center,width*xRatio,height*yRatio);
    }

    @Override
    public void clearProxy() {

    }
}

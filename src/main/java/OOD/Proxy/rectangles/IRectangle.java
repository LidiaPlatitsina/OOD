package OOD.Proxy.rectangles;

public interface IRectangle {

    Rectangle moveTo(int x, int y);
    Rectangle stretch(int xRatio, int yRatio);
    abstract void clearProxy();
}

package OOD.Proxy.proxy;

import OOD.Proxy.rectangles.IRectangle;
import OOD.Proxy.rectangles.Rectangle;

public class RectangleProxy implements IRectangle {
    private IRectangle rectangle;
    private Rectangle result = null;

    public RectangleProxy(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public Rectangle moveTo(int x, int y) {
        if(result == null){
            result = rectangle.moveTo(x, y);
        }
        return result;
    }

    @Override
    public Rectangle stretch(int xRatio, int yRatio) {
        if(result == null)
        {
            result = rectangle.stretch(xRatio, yRatio);
        }
        return result;
    }

    @Override
    public void clearProxy(){
        result =null;
    }
}

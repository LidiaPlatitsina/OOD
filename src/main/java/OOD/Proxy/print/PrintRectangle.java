package OOD.Proxy.print;

import OOD.Proxy.proxy.RectangleProxy;
import OOD.Proxy.rectangles.IRectangle;
import OOD.Proxy.rectangles.Rectangle;

public class PrintRectangle {
    private IRectangle rectangle;

    public PrintRectangle(RectangleProxy proxy) {
        this.rectangle = proxy;
    }

    public void printRectangle(int x, int y, int xRatio, int yRatio){
        Rectangle result1 = rectangle.stretch(xRatio, yRatio);
        System.out.println("Растянутый прямоугольник: "+"Точка "+ result1.getCenter().getX()+" "+ result1.getCenter().getY()
                +" Ширина "+result1.getWidth()+" Высота "+result1.getHeight());
        rectangle.clearProxy();
        Rectangle result = rectangle.moveTo(x,y);
        System.out.println("Передвинутый прямоугольник: "+"Точка "+ result.getCenter().getX()+" "+ result.getCenter().getY()
        +" Ширина "+result.getWidth()+" Высота "+result.getHeight());


    }

}

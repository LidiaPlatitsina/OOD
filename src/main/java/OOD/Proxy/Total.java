package OOD.Proxy;

import OOD.Proxy.print.PrintRectangle;
import OOD.Proxy.proxy.RectangleProxy;
import OOD.Proxy.rectangles.Point;
import OOD.Proxy.rectangles.Rectangle;

public class Total {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(),1,1);
        PrintRectangle printRectangle = new PrintRectangle(new RectangleProxy(rectangle));
        printRectangle.printRectangle(1,1,5,6);
        System.out.println("Первоночальнаый треугольник: "+"Точка "+ rectangle.getCenter().getX()+" "+ rectangle.getCenter().getY()
                +" Ширина "+rectangle.getWidth()+" Высота "+rectangle.getHeight());
    }
}

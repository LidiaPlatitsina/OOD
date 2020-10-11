package OOD.AbstractFactory.app;

import OOD.AbstractFactory.Notebook;
import OOD.AbstractFactory.Pen;
import OOD.AbstractFactory.factories.Factory;

public class StationaryShop {

    private Notebook notebook;
    private Pen pen;

    public StationaryShop(Factory factory,int sheets,String size,String type,
                          String color,boolean abrasion)
    {
        notebook=factory.createNotebook(sheets, size, type);
        pen=factory.createPen(color, abrasion);
    }

    public void print()
    {
        notebook.print();
        pen.print();
    }
}

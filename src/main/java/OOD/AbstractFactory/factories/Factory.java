package OOD.AbstractFactory.factories;

import OOD.AbstractFactory.Notebook;
import OOD.AbstractFactory.Pen;

public interface Factory {

    Notebook createNotebook(int sheets,String size,String type);
    Pen createPen(String color, boolean abrasion);
}

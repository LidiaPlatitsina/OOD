package OOD.AbstractFactory.factories;

import OOD.AbstractFactory.Notebook;
import OOD.AbstractFactory.Pen;
import OOD.AbstractFactory.ShapesThemeNotebook;
import OOD.AbstractFactory.ShapesThemePen;

public class ShapesThemeFactory implements Factory {
    @Override
    public Notebook createNotebook(int sheets, String size, String type) {
        return new ShapesThemeNotebook(sheets,size,type);
    }

    @Override
    public Pen createPen(String color, boolean abrasion) {
        return new ShapesThemePen(color,abrasion);
    }
}

package OOD.AbstractFactory.factories;

import OOD.AbstractFactory.CatThemeNotebook;
import OOD.AbstractFactory.CatThemePen;
import OOD.AbstractFactory.Notebook;
import OOD.AbstractFactory.Pen;

public class CatThemeFactory implements Factory {
    @Override
    public Notebook createNotebook(int sheets, String size, String type) {
        return new CatThemeNotebook(sheets,size,type);
    }

    @Override
    public Pen createPen(String color, boolean abrasion) {
        return new CatThemePen(color,abrasion);
    }
}

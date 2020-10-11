package OOD.AbstractFactory;

import OOD.AbstractFactory.app.StationaryShop;
import OOD.AbstractFactory.factories.CatThemeFactory;
import OOD.AbstractFactory.factories.Factory;
import OOD.AbstractFactory.factories.ShapesThemeFactory;

public class AbstractFactory {
    private static StationaryShop configure(String themeName,int sheets,String size,String type,
                                            String color,boolean abrasion)
    {
        StationaryShop shop;
        Factory factory;
        if(themeName.equalsIgnoreCase(("cat"))==true)
        {
            factory =new CatThemeFactory();
            shop = new StationaryShop(factory,sheets,size,type,color,abrasion);
        }
        else {
            factory = new ShapesThemeFactory();
            shop = new StationaryShop(factory,sheets,size,type,color,abrasion);
        }
        return shop;
    }

    public static void main(String[] args) {
        StationaryShop shop = configure("cat",48,"A5","точка", "черный",true);
        shop.print();
        StationaryShop shop1 = configure("shapes",96,"A4","клетка", "синий",false);
        shop1.print();
    }
}

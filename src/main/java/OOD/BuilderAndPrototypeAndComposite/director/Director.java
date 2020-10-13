package OOD.BuilderAndPrototypeAndComposite.director;

import OOD.BuilderAndPrototypeAndComposite.builders.Builder;
import OOD.BuilderAndPrototypeAndComposite.components.*;
import OOD.BuilderAndPrototypeAndComposite.components.moldsOrPatternComposite.Animals;
import OOD.BuilderAndPrototypeAndComposite.components.moldsOrPatternComposite.IMold;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static OOD.BuilderAndPrototypeAndComposite.components.Oil.*;

public class Director {
    public void constructLiquidSoapFlowers(Builder builder)
    {
        List<Oil> oils= new ArrayList<Oil>();
        oils.add(APRICOT_PITS);
        oils.add(AVOCADO);

        builder.setBasis(Basis.LIQUID);
        builder.setBasicDye(Dye.BLUE);
        builder.setOil(oils);
        builder.setWeight(500);
        builder.setPerfume(Perfume.FLOWERS);
        System.out.println("Вы создали жидкое мыло");
    }

    public void constructSolidSoapWhiteBear(Builder builder)
    {
        List<String> details = new ArrayList<>();
        details.add("Нос");
        details.add("Уши");
        details.add("Лапы");
        List<Dye> dye = new ArrayList<>();
        dye.add(Dye.BLACK);
        dye.add(Dye.PINK);
        dye.add(Dye.BLACK);
        DyeDetails dyeDetails = new DyeDetails(details,dye);
        IMold mold = new Animals(details, Animals.Animal.BEAR);

        builder.setBasis(Basis.SOLID);
        builder.setBasicDye(Dye.WHITE);
        builder.setPerfume(Perfume.LEMON);
        builder.setWeight(mold.getWeight());
        builder.setMold(mold);
        builder.setDyeDetails(dyeDetails);
        System.out.println("Вы создали мыло в виде белого медведя");
    }

    public void constructLiquidSoapForKids(Builder builder)
    {
        List<Oil> oils= new ArrayList<Oil>();
        oils.add(GRAPE_SEED);

        builder.setBasis(Basis.LIQUID);
        builder.setOil(oils);
        builder.setWeight(400);
        System.out.println("Вы создали детское жидкое мыло");

    }
}

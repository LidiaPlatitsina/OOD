package OOD.BuilderAndPrototypeAndComposite;

import OOD.BuilderAndPrototypeAndComposite.SoapOrPatternPrototype.LiquidSoap;
import OOD.BuilderAndPrototypeAndComposite.SoapOrPatternPrototype.SolidSoap;
import OOD.BuilderAndPrototypeAndComposite.builders.SoapBuilder;
import OOD.BuilderAndPrototypeAndComposite.director.Director;

public class Total {
    public static void main(String[] args) {
        Director director =new Director();
        SoapBuilder builder = new SoapBuilder();

        director.constructLiquidSoapFlowers(builder);
        LiquidSoap liquidSoap = builder.getResultLiquid();
        liquidSoap.clone();

        director.constructSolidSoapWhiteBear(builder);
        SolidSoap solidSoap = builder.getResultSolid();
        solidSoap.clone();

        director.constructLiquidSoapForKids(builder);
        LiquidSoap liquidSoap1= builder.getResultLiquid();

    }
}

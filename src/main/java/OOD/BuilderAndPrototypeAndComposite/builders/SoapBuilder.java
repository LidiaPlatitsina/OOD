package OOD.BuilderAndPrototypeAndComposite.builders;

import OOD.BuilderAndPrototypeAndComposite.SoapOrPatternPrototype.LiquidSoap;
import OOD.BuilderAndPrototypeAndComposite.SoapOrPatternPrototype.SolidSoap;
import OOD.BuilderAndPrototypeAndComposite.components.*;
import OOD.BuilderAndPrototypeAndComposite.components.moldsOrPatternComposite.IMold;

import java.util.List;

public class SoapBuilder implements Builder {
    private Basis basis;
    private Perfume perfume;
    private Dye basisDye;
    private DyeDetails detailsDye;
    private List<Oil> oil;
    private IMold mold;
    private int weight;

    @Override
    public void setBasis(Basis basis) {
        this.basis = basis;
    }

    @Override
    public void setPerfume(Perfume perfume) {
        this.perfume = perfume;
    }

    @Override
    public void setBasicDye(Dye dye) {
        this.basisDye = dye;
    }

    @Override
    public void setDyeDetails(DyeDetails dye) {
        this.detailsDye = dye;
    }

    @Override
    public void setOil(List<Oil> oil) {
        this.oil = oil;
    }

    @Override
    public void setMold(IMold mold) {
        this.mold = mold;
    }

    @Override
    public void setWeight(int weight) {
        this.weight =weight;
    }

    public LiquidSoap getResultLiquid()
    {
        System.out.println("Создано жидкое мыло");
        return new LiquidSoap(perfume,basisDye,weight,oil);
    }

    public SolidSoap getResultSolid()
    {
        System.out.println("Создано твердое мыло");
        return new SolidSoap(perfume,basisDye,weight,detailsDye,mold);
    }
}

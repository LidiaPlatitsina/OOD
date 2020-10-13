package OOD.BuilderAndPrototypeAndComposite.SoapOrPatternPrototype;

import OOD.BuilderAndPrototypeAndComposite.components.Basis;
import OOD.BuilderAndPrototypeAndComposite.components.Dye;
import OOD.BuilderAndPrototypeAndComposite.components.Oil;
import OOD.BuilderAndPrototypeAndComposite.components.Perfume;

import java.util.List;
import java.util.Objects;

public class LiquidSoap extends Soap {
    private Basis basis;
    private List<Oil> oil;

    public LiquidSoap(Perfume perfume, Dye basesDye, int weight, List<Oil> oil) {
        super(perfume, basesDye, weight);
        this.basis = Basis.LIQUID;
        this.oil = oil;
    }

    public LiquidSoap(){}

    public LiquidSoap(LiquidSoap target) {
        super(target);
        if(target!= null){
            this.basis=Basis.LIQUID;
        this.oil = target.oil;}
    }

    @Override
    public Soap clone() {
        System.out.println("Создана копия");
        return new LiquidSoap(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LiquidSoap)) return false;
        if (!super.equals(o)) return false;
        LiquidSoap that = (LiquidSoap) o;
        return Objects.equals(oil, that.oil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), oil);
    }
}

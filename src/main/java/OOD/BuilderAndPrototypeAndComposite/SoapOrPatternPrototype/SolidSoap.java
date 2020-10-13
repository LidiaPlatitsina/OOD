package OOD.BuilderAndPrototypeAndComposite.SoapOrPatternPrototype;

import OOD.BuilderAndPrototypeAndComposite.components.Basis;
import OOD.BuilderAndPrototypeAndComposite.components.Dye;
import OOD.BuilderAndPrototypeAndComposite.components.DyeDetails;
import OOD.BuilderAndPrototypeAndComposite.components.Perfume;
import OOD.BuilderAndPrototypeAndComposite.components.moldsOrPatternComposite.IMold;

import java.util.Objects;

public class SolidSoap extends Soap {
    private Basis basis;
    private DyeDetails detailsDye;
    private IMold mold;

    public SolidSoap(){}

    public SolidSoap(Perfume perfume, Dye basesDye, int weight, DyeDetails detailsDye, IMold mold) {
        super(perfume, basesDye, weight);
        this.detailsDye = detailsDye;
        this.mold = mold;
        this.basis=Basis.SOLID;
    }

    public SolidSoap(SolidSoap target) {
        super(target);
        if(target!= null){
            this.basis = Basis.SOLID;
            this.detailsDye=target.detailsDye;
            this.mold=target.mold;
        }

    }

    @Override
    public Soap clone() {
        System.out.println("Создана копия");
        return new SolidSoap(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SolidSoap)) return false;
        if (!super.equals(o)) return false;
        SolidSoap solidSoap = (SolidSoap) o;
        return Objects.equals(detailsDye, solidSoap.detailsDye) &&
                Objects.equals(mold, solidSoap.mold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), detailsDye, mold);
    }
}

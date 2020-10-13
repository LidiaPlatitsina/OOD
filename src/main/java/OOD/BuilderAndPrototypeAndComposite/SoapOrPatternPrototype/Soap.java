package OOD.BuilderAndPrototypeAndComposite.SoapOrPatternPrototype;

import OOD.BuilderAndPrototypeAndComposite.components.*;

import java.util.Objects;

public abstract class Soap {
    private  Perfume perfume;
    private Dye basesDye;
    private  int weight;

    public Soap(){}

    public Soap(Perfume perfume, Dye basesDye, int weight) {
        this.perfume = perfume;
        this.basesDye = basesDye;
        this.weight = weight;
    }

    public Soap(Soap target){
        if(target!=null)
        {
            this.basesDye = target.basesDye;
            this.perfume =target.perfume;
            this.weight = target.weight;
        }
    }

    public abstract Soap clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soap)) return false;
        Soap soap = (Soap) o;
        return weight == soap.weight &&
                perfume == soap.perfume &&
                basesDye == soap.basesDye;
    }

    @Override
    public int hashCode() {
        return Objects.hash(perfume, basesDye, weight);
    }
}

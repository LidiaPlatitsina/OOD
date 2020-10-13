package OOD.BuilderAndPrototypeAndComposite.builders;

import OOD.BuilderAndPrototypeAndComposite.components.*;
import OOD.BuilderAndPrototypeAndComposite.components.moldsOrPatternComposite.IMold;

import java.util.List;

public interface Builder {
    void setBasis(Basis basis);
    void setPerfume(Perfume perfume);
    void setBasicDye(Dye dye);
    void setDyeDetails(DyeDetails details);
    void setOil(List<Oil> oil);
    void setMold(IMold mold);
    void setWeight(int weight);
}

package OOD.BuilderAndPrototypeAndComposite.components.moldsOrPatternComposite;

import java.util.List;

abstract class Mold implements IMold {
    public List<String> details;
    public String name;

    public Mold(List<String> details,String name) {
        this.details = details;
        this.name = name;
    }

    @Override
    public List<String> getDetails() {
        return details;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public String getFormat() {
        return null;
    }


}

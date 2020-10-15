package OOD.Adapter.adapter;

import OOD.Adapter.compatible.Liquid;
import OOD.Adapter.incompatible.Solid;

public class SolidAdapter extends Liquid {
    private Solid solid;

    public SolidAdapter(Solid solid)
    {
        this.solid = solid;
    }

    @Override
    public double getVolume() {
        double result;
        result = solid.getNumberOfElem()*solid.getVolumeOneElem();
        return result;
    }
}

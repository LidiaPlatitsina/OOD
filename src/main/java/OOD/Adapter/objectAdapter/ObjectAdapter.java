package OOD.Adapter.objectAdapter;

import OOD.Adapter.adapter.SolidAdapter;
import OOD.Adapter.compatible.Liquid;
import OOD.Adapter.incompatible.Solid;

public class ObjectAdapter extends Liquid implements SolidInterface {
    public double volumeOneElem;
    public int numberOfElem;
    private SolidAdapter adapter;

    public ObjectAdapter(double volumeOneElem, int numberOfElem) {
        this.adapter = new SolidAdapter(new Solid(volumeOneElem,numberOfElem));
    }

    public ObjectAdapter(Solid solid)
    {
        this.adapter = new SolidAdapter(solid);
    }

    @Override
    public double getVolume() {
       return adapter.getVolume();
    }
}

package OOD.Adapter.compatible;

public class Vessel {
    public double volume;

    public Vessel(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public boolean put(Liquid liquid)
    {
        boolean result;
        result = (this.volume >= liquid.getVolume());
        return result;
    }
}

package OOD.Adapter.incompatible;

public class Solid {
    public double volumeOneElem;
    public int numberOfElem;

    public Solid(double volumeOneElem, int numberOfElem) {
        this.volumeOneElem = volumeOneElem;
        this.numberOfElem = numberOfElem;
    }

    public double getVolumeOneElem() {
        return volumeOneElem;
    }

    public int getNumberOfElem() {
        return numberOfElem;
    }
}

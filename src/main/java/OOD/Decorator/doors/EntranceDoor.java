package OOD.Decorator.doors;

public class EntranceDoor extends Door{
    private int keyLock;

    public EntranceDoor(IDoor door,boolean handleOnBothSides,String material,String color,int keyLock)
    {
        super(door,handleOnBothSides,material,color);
        this.keyLock = keyLock;
    }
}

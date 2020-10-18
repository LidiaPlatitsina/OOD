package OOD.Decorator.doors;

public class InteriorDoor extends Door {
    private boolean glassInsert;
    private double width;
    private double height;

    public InteriorDoor(IDoor door,String material,String color,boolean glassInsert)
    {
        super(door,true,material,color);
        this.glassInsert =glassInsert;
    }

    public void sizeOfGlassInsert(double width, double height)
    {
        if(glassInsert)
        {
            this.width =width;
            this.height = height;
            System.out.println("Размеры стеклянной вставки: "+ width+" "+height);
        }

    }

}

package OOD.Decorator.doors;

public class Door implements IDoor {
    private int width;
    private int height;
    private boolean handleOnBothSides;
    private String material;
    private String color;

    public Door(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Door(IDoor door, boolean handleOnBothSides, String material, String color)
    {
        this(door.getWidth(),door.getHeight());
        this.handleOnBothSides=handleOnBothSides;
        this.material = material;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isHandleOnBothSides() {
        return handleOnBothSides;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

}
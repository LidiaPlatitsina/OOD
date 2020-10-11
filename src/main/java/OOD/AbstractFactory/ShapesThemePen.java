package OOD.AbstractFactory;

public class ShapesThemePen implements Pen {

    private String color;
    private boolean abrasion;

    public ShapesThemePen(String color, boolean abrasion) {
       setColor(color);
       setAbrasion(abrasion);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public boolean getAbrasion() {
        return abrasion;
    }

    @Override
    public void setAbrasion(boolean abrasion) {
        this.abrasion=abrasion;
    }

    public String getAbrasionSt(){
        if(abrasion=true){return "abrasion"; }
        else{return "not abrasion";}
    }

    @Override
    public void print() {
        System.out.println("You create Shapes Theme Pen"+" "+getColor()+" "+getAbrasionSt());
    }
}

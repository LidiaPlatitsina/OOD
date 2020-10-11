package OOD.AbstractFactory;

public class CatThemePen implements Pen {
    private String color;
    private boolean abrasion;

    public CatThemePen(String color, boolean abrasion) {
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

    public String getAbrasionSt(){
        if(abrasion=true){return "abrasion"; }
        else{return "not abrasion";}
    }

    @Override
    public void setAbrasion(boolean abrasion) {
        this.abrasion=abrasion;
    }

    @Override
    public void print() {
        System.out.println("You create Cat Theme Pen"+" "+getColor()+" "+getAbrasionSt());
    }
}

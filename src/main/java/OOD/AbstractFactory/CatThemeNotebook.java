package OOD.AbstractFactory;

public class CatThemeNotebook implements Notebook
{
    private int sheets;
    private String size;
    private String type;

    public CatThemeNotebook(int sheets, String size, String type) {
        setSheets(sheets);
        setSize(size);
        setType(type);
    }

    @Override
    public int getSheets() {
        return sheets;
    }

    @Override
    public void setSheets(int sheets) {
        this.sheets=sheets;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String size) {
        this.size=size;
    }


    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type=type;
    }

    @Override
    public void print() {
        System.out.println("You create Cat Theme Notebook"+" "+getSheets()+" "+getSize()+" "+getType());
    }
}

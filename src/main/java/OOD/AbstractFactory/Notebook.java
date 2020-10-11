package OOD.AbstractFactory;

public interface Notebook {

    int getSheets();
    void setSheets(int sheets);
    String getSize();
    void setSize(String size);
    String getType();
    void setType(String type);
    void print();
}

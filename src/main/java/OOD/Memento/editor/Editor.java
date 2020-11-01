package OOD.Memento.editor;

import OOD.Memento.circle.Circle;
import OOD.Memento.memento.Memento;

public class Editor {
    private Memento memento = new Memento(new Circle(1));

    public void increaseRadius(Circle circle, double num)
    {
        memento.addInHistory(circle);
        circle.increaseRadiusBy(num);
    }

    public void decreaseRadius(Circle circle, double num)
    {
        memento.addInHistory(circle);
        circle.decreaseRadiusBy(num);
    }

    public void changeRadius(Circle circle, double radius)
    {
        memento.addInHistory(circle);
        circle.changeRadius(radius);
    }


    public void print(){
        memento.getHistory().print();
    }
}

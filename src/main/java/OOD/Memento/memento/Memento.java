package OOD.Memento.memento;

import OOD.Memento.circle.Circle;
import OOD.Memento.history.History;

public class Memento {
    private static History history = new History();
    private Circle circle;

    public Memento(Circle circle) {
        this.circle = new Circle(circle.getRadius());
    }

     public void addInHistory(Circle circle){
        Memento memento = new Memento(circle);
        history.add(memento);
     }

     public void print()
     {
         circle.print();
     }

    public History getHistory() {
        return history;
    }
}


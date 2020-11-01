package OOD.Memento;

import OOD.Memento.circle.Circle;
import OOD.Memento.editor.Editor;

public class Total {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Editor editor = new Editor();

        editor.increaseRadius(circle,5);
        editor.decreaseRadius(circle,2);
        editor.changeRadius(circle,4);

        editor.print();
    }
}

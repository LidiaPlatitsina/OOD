package OOD.Memento.history;

import OOD.Memento.memento.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<Memento> list = new ArrayList<>();

    public List<Memento> getList() {
        return list;
    }

    public void add(Memento memento)
    {
        list.add(memento);
    }

    public void print()
    {
        for (Memento elem: list)
        {
            elem.print();
        }
    }
}

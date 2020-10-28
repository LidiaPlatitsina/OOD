package OOD.IteratorAndVisitor.visitor;

import OOD.IteratorAndVisitor.iterator.Iterator;

import java.util.List;

public class Visitor implements IVisitor{
    private Iterator iterator;

    @Override
    public void visit(List<String> str) {
        iterator = new Iterator();
        while (iterator.hasNext()) {
            iterator.next().makeOrder(str);
        }
    }
}

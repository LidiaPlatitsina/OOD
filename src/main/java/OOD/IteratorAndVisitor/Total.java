package OOD.IteratorAndVisitor;

import OOD.IteratorAndVisitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Total {

    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        visitor.visit(addList());

    }

    public static List<String> addList(){
        List<String> list = new ArrayList<>();
        list.add("боди");
        list.add("футболка");
        list.add("кофта");
        list.add("штаны");
        list.add("платье");
        list.add("рубашка");
        list.add("брюки");
        list.add("пиджак");
        list.add("юбка");
        list.add("блузка");
        return list;
    }
}

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
        list.add("Д:боди");
        list.add("Д:футболка");
        list.add("Д:кофта");
        list.add("Д:штаны");
        list.add("Д:платье");
        list.add("Д:рубашка");
        list.add("М:футболка");
        list.add("М:рубашка");
        list.add("М:брюки");
        list.add("М:пиджак");
        list.add("Ж:платье");
        list.add("Ж:футболка");
        list.add("Ж:юбка");
        list.add("Ж:блузка");
        list.add("Ж:штаны");
        return list;
    }
}

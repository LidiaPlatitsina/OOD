package OOD.IteratorAndVisitor.visitor;

import OOD.IteratorAndVisitor.clothingStore.Store;
import OOD.IteratorAndVisitor.clothingStore.childrenDepartment.ChildrenDepartment;
import OOD.IteratorAndVisitor.clothingStore.menDepartment.MenDepartment;
import OOD.IteratorAndVisitor.clothingStore.womenDepartment.WomenDepartment;
import OOD.IteratorAndVisitor.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Visitor implements IVisitor{
    private Iterator iterator;

    public void visitShop(Store store,List<String> list){
        if (store.equals(new WomenDepartment())) {
            store.makeOrder(WList(list));
        }
        if(store.equals(new MenDepartment())){
            store.makeOrder(MList(list));
        }
        if(store.equals(new ChildrenDepartment()))
        {
            store.makeOrder(KList(list));
        }
    }


    @Override
    public void visit(List<String> str) {
        iterator = new Iterator();
        while (iterator.hasNext()) {
           visitShop(iterator.next(),str);
        }
    }

    public List<String> WList(List<String> list)
    {
        List<String> result = new ArrayList<>();
       String[] res;
        for (String elem: list) {
            if(elem.startsWith("For Women:")|| elem.startsWith("Ж:") || elem.startsWith("Для женчин:"))
            {
                res=elem.split(":");
                result.add(res[1]);
            }
        }
        return result;
    }

    public List<String> KList(List<String> list)
    {
        List<String> result = new ArrayList<>();
        String[] res;
        for (String elem: list) {
            if(elem.startsWith("For Kids:")|| elem.startsWith("Д:") || elem.startsWith("Для детей:"))
            {
                res=elem.split(":");
                result.add(res[1]);
            }
        }
        return result;
    }

    public List<String> MList(List<String> list)
    {
        List<String> result = new ArrayList<>();
        String[] res;
        for (String elem: list) {
            if(elem.startsWith("For Men:")|| elem.startsWith("М:") || elem.startsWith("Для мужчин:"))
            {
                res=elem.split(":");
                result.add(res[1]);
            }
        }
        return result;
    }
}

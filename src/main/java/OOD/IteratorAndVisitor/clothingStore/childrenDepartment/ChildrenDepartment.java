package OOD.IteratorAndVisitor.clothingStore.childrenDepartment;

import OOD.IteratorAndVisitor.clothingStore.Store;

import java.util.List;

public class ChildrenDepartment implements Store {
    public String name = "ChildrenDepartment";

    public String getName() {
        return name;
    }

    @Override
    public int cost(List<String> order) {
        int sum = 0;
        for (String elem:order)
        {
            sum+= Price.kidsPrice(elem);
        }
        return sum;
    }

    @Override
    public void makeOrder(List<String> order) {
        System.out.println("Вы сделали заказ в детском отделе.");
        System.out.println("Сумма: "+cost(order));
    }
}

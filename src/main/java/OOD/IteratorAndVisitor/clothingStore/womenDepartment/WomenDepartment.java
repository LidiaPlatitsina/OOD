package OOD.IteratorAndVisitor.clothingStore.womenDepartment;

import OOD.IteratorAndVisitor.clothingStore.Store;

import java.util.List;
import java.util.Objects;

public class WomenDepartment implements Store {

    public String name = "WomenDepartment";


    public String getName() {
        return name;
    }

    @Override
    public int cost(List<String> order) {
        int sum = 0;
        for (String elem:order)
        {
            sum+= Price.womenPrice(elem);
        }
        return sum;
    }

    @Override
    public void makeOrder(List<String> order) {
        System.out.println("Вы сделали заказ в женском отделе.");
        System.out.println("Сумма: "+cost(order));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WomenDepartment)) return false;
        WomenDepartment that = (WomenDepartment) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

package OOD.IteratorAndVisitor.clothingStore;

import java.util.List;

public interface Store {
    int cost(List<String> order);
    void makeOrder(List<String> order);
    String getName();
}

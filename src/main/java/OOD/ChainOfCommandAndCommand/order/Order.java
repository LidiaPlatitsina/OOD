package OOD.ChainOfCommandAndCommand.order;

import OOD.ChainOfCommandAndCommand.orderElems.Sequencing;

import java.util.List;

public class Order {
private Sequencing sequencing;
    public Order() {
    }

    public void setSequencing(Sequencing sequencing)
    {
        this.sequencing = sequencing;
    }

    public void registration(List<String> order)
    {
        sequencing.execute(order);
    }
}

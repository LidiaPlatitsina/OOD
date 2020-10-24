package OOD.ChainOfCommandAndCommand.orderElems;

import OOD.ChainOfCommandAndCommand.order.Order;

import java.util.List;

public abstract class Sequencing extends Command {
    private Sequencing next;

    public Sequencing(Order order) {
        super(order);
    }

    public Sequencing linkWith(Sequencing next){
        this.next = next;
        return next;
    }

    public abstract void execute(List<String> booking);
}

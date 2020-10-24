package OOD.ChainOfCommandAndCommand.orderElems;

import OOD.ChainOfCommandAndCommand.order.Order;

import java.util.List;

public abstract class Command {
    public Order order;

    public Command(Order order) {
        this.order = order;
    }

    public abstract void execute(List<String> booking);
}

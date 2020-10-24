package OOD.ChainOfCommandAndCommand.orderElems;

import OOD.ChainOfCommandAndCommand.order.Order;
import OOD.ChainOfCommandAndCommand.price.Price;

import java.util.List;

public class OrderPrice extends Sequencing{
    private StockCheck stockCheck;
    private int sum;

    public OrderPrice(Order order) {
        super(order);
    }

    public int amount(List<String> order)
    {
        int sum = 0;
        for (String elem:order)
        {
           sum+= Price.price(elem);
        }
        return sum;
    }

    @Override
    public void execute(List<String> booking) {
        System.out.println(amount(booking));
    }
}

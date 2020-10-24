package OOD.ChainOfCommandAndCommand;

import OOD.ChainOfCommandAndCommand.order.Order;
import OOD.ChainOfCommandAndCommand.orderElems.OrderPrice;
import OOD.ChainOfCommandAndCommand.orderElems.Sequencing;
import OOD.ChainOfCommandAndCommand.orderElems.StockCheck;

import java.util.ArrayList;
import java.util.List;

public class Total {
    private static Order order;

    public static void start()
    {
        order = new Order();

        Sequencing sequencing = new StockCheck(order).linkWith(new OrderPrice(order));

        order.setSequencing(sequencing);
    }

    public static List<String> list1()
    {
        List<String> booking1 =new ArrayList<>();
        booking1.add("Корм для канарейки");
        booking1.add("Корм для попугаев");
        booking1.add("Витамины для птиц");
        booking1.add("Сухой корм для собак");
        booking1.add("Консервы для собак");
        booking1.add("Витамины для собак");
        booking1.add("Сухой корм для кошек");
        booking1.add("Консервы для кошек");
        booking1.add("Витамины для кошек");
        return  booking1;
    }

    public static List<String> list2(){
        List<String> booking1 =new ArrayList<>();
        booking1.add("Набор из 2 мисок для кошек");
        booking1.add("Лежанка для кошки");
        booking1.add("Наполнитель для кошачего туалета");
        booking1.add("Домик-когтеточка");
        booking1.add("Когтеточка");
        booking1.add("Сухой корм для кошек");
        booking1.add("Консервы для кошек");
        booking1.add("Витамины для кошек");
        return booking1;
    }

    public static void main(String[] args) {
        start();
        System.out.println("Сумма первого заказа:");
        order.registration(list1());
        System.out.println("Сумма второго заказа:");
        order.registration(list2());
    }
}

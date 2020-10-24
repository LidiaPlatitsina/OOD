package OOD.ChainOfCommandAndCommand.orderElems;

import OOD.ChainOfCommandAndCommand.order.Order;
import OOD.ChainOfCommandAndCommand.stock.*;

import java.util.ArrayList;
import java.util.List;

public class StockCheck extends Sequencing {
    List<String> result;

    public StockCheck(Order order) {
        super(order);
    }

    public List<String> checkAvailability(List<String> booking)
    {
        int i;
        List<String> result = new ArrayList<>();
        for (i=0; i<booking.size(); i++){}
        {
            if(ForBirds.check(booking.get(i))==false&& ForDogs.check(booking.get(i))==false
            && ForCats.check(booking.get(i))==false)
            {
                result.add(booking.get(i));
            }
        }
        return result;
    }

    @Override
    public void execute(List<String> booking)
    {
       checkAvailability(booking);
        result = resultOrder(booking);
    }

    public List<String> getResult() {
        return result;
    }

    public List<String> resultOrder(List<String> order)
    {
        List<String> res = new ArrayList<>();
        if (result!=null){
        for (int i = 0,j=0; i < order.size(); i++) {
            if(!order.get(i).equals(result.get(j)))
            {
                res.add(order.get(i));
            }
            else {
                j++;
            }
        }
        }
        return res;
    }

}

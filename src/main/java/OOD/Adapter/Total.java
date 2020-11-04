package OOD.Adapter;

import OOD.Adapter.adapter.SolidAdapter;
import OOD.Adapter.compatible.Liquid;
import OOD.Adapter.compatible.Vessel;
import OOD.Adapter.incompatible.Solid;
import OOD.Adapter.objectAdapter.ObjectAdapter;
import OOD.Adapter.objectAdapter.SolidInterface;

public class Total {
    public static void main(String[] args) {
        Vessel vessel = new Vessel(500);
        Liquid liquid = new Liquid(500);
        if(vessel.put(liquid))
        {
            System.out.println("500 мл жидкости помещается в ёмкости обЪёмам 500");
        }

        Solid solid = new Solid(50,10);
        Solid solid1 = new Solid(50,30);

        SolidAdapter solidAdapter = new SolidAdapter(solid);
        SolidAdapter solidAdapter1 = new SolidAdapter(solid1);

        if(vessel.put(solidAdapter))
        {
            System.out.println("10 шт по объёмы 50 помещается в ёмкости обЪёмам 500");
        }
        if(!vessel.put(solidAdapter1))
        {
            System.out.println("30 шт по объёму 50 не помещается в ёмкость объёмам 500");
        }

        SolidInterface solidOA1 = new ObjectAdapter(solid1);
        SolidInterface solidOA2 = new ObjectAdapter(25,20);

        if(!vessel.put(solidOA1))
        {
            System.out.println("OA: 30 шт по объёму 50 не помещается в ёмкость объёмам 500");
        }
        if(vessel.put(solidOA2))
        {
            System.out.println("20 шт по объёму 25 помещается в ёмкость объёмам 500");
        }

    }
}

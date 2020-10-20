package OOD.Flyweight.cubes;

import java.util.ArrayList;
import java.util.List;

public class CubPoint {
    private List<Cub> cubs = new ArrayList<>();

    public void pointCub(String name,String colors){
        CubType cubType = CubFactory.getCubType(name,colors);
        Cub cub = new Cub(cubType);
        cubs.add(cub);
    }

    public void point(){
        for (Cub cub : cubs)
        {
            System.out.println(cub.paint());
        }
    }
}

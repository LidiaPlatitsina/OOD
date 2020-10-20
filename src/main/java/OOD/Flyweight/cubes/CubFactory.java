package OOD.Flyweight.cubes;

import java.util.HashMap;
import java.util.Map;

public class CubFactory {
    private static Map<String,CubType> cubType = new HashMap<>();

    public static CubType getCubType(String name, String colors)
    {
        CubType result = cubType.get(name);
        if(result ==null)
        {
            result = new CubType(colors);
            cubType.put(name,result);
        }
        return result;
    }
}

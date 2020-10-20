package OOD.Flyweight.cubes;

import java.util.ArrayList;
import java.util.List;

public class CubType {
    private String colors;

    public CubType(String colors)
    {
        this.colors = colors;
    }

    public String paint(String edges)
    {
        List<String> result = new ArrayList<>();
        String[] color = colors.split(" ");
        String[] edge = edges.split(" ");
        if(color.length>= edge.length)
        {
            for (int i = 0; i < color.length-1; i++) {
               result.add(edge[i]+": "+color[i]+" ");
            }
        }
        else{
            System.out.println("Список цветов не соответствует списку граней");
        }
        return result.toString();
    };
}

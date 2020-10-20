package OOD.Flyweight.cubes;

import java.util.List;

public class Cub {
    private String edges;
    private CubType type;

    public Cub(CubType type)
    {
        edges = "Передняя"+" "+"Задняя"+" "+"Верхняя"+" "+"Нижняя"+" "+
        "Правая"+" "+"Левая";
        this.type = type;
    }

    public String paint()
    {
        return type.paint(edges);
    }
}

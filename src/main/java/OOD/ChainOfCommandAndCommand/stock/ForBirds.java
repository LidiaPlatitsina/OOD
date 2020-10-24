package OOD.ChainOfCommandAndCommand.stock;

public enum ForBirds {
    VITAMINS("Витамины для птиц"),
    FOOD_FOR_CANARY("Корм для канарейки"),
    FOOD_FOR_PARROTS("Корм для попугаев"),
    CELL("Клетка"),
    DRINKING("Поилка"),
    FEEDER("Кормушка"),
    VENT("Жердочка"),
    BELL("Колокльчик");

     private String name;

    ForBirds(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static boolean check(String elem)
    {
        return elem.equalsIgnoreCase(BELL.name)||elem.equalsIgnoreCase(VENT.name)||elem.equalsIgnoreCase(FEEDER.name)||
        elem.equalsIgnoreCase(DRINKING.name)||elem.equalsIgnoreCase(CELL.name)||elem.equalsIgnoreCase(FOOD_FOR_PARROTS.name)
        || elem.equalsIgnoreCase(FOOD_FOR_CANARY.name)||elem.equalsIgnoreCase(VITAMINS.name);
    }
}

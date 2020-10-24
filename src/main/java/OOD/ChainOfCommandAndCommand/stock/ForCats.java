package OOD.ChainOfCommandAndCommand.stock;

public enum ForCats {
    DRY_FOOD("Сухой корм для кошек"),
    WET_FOOD("Консервы для кошек"),
    VITAMINS("Витамины для кошек"),
    SET_OF_2BOWLS("Набор из 2 мисок для кошек"),
    BEDROOM("Лежанка для кошки"),
    TOILET_FILLER("Наполнитель для кошачего туалета"),
    LITTLE_HOUSES("Домик-когтеточка"),
    CLUTCH("Когтеточка");

    private String name;

    ForCats(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static boolean check(String elem)
    {
        return elem.equalsIgnoreCase(CLUTCH.name)||elem.equalsIgnoreCase(LITTLE_HOUSES.name)||
                elem.equalsIgnoreCase(TOILET_FILLER.name)|| elem.equalsIgnoreCase(BEDROOM.name)||
                elem.equalsIgnoreCase(SET_OF_2BOWLS.name)|| elem.equalsIgnoreCase(VITAMINS.name)||
                elem.equalsIgnoreCase(WET_FOOD.name)||elem.equalsIgnoreCase(DRY_FOOD.name);
    }
}


package OOD.ChainOfCommandAndCommand.stock;

public enum ForDogs {
    DRY_FOOD("Сухой корм для собак"),
    WET_FOOD("Консервы для собак"),
    VITAMINS("Витамины для собак"),
    COLLAR("Ошейник"),
    MUZZLE("Намордник"),
    LEAD("Поводок"),
    BEDROOM("Лежанка для собаки"),
    SET_OF_2BOWLS("Набор из 2 мисок для собаки"),
    BALL("Игрушка мячик для собаки"),
    BONE("Игрушка косточка для собаки");


    private String name;

    ForDogs(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static boolean check(String elem){
        return elem.equalsIgnoreCase(BONE.name)||elem.equalsIgnoreCase(BALL.name)||elem.equalsIgnoreCase(SET_OF_2BOWLS.name)||
                elem.equalsIgnoreCase(BEDROOM.name)||elem.equalsIgnoreCase(LEAD.name)||elem.equalsIgnoreCase(MUZZLE.name)||
                elem.equalsIgnoreCase(COLLAR.name)|| elem.equalsIgnoreCase(VITAMINS.name)||elem.equalsIgnoreCase(WET_FOOD.name)||
                elem.equalsIgnoreCase(DRY_FOOD.name);
    }
}

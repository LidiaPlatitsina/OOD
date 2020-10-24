package OOD.ChainOfCommandAndCommand.price;

import OOD.ChainOfCommandAndCommand.stock.*;

public class Price {
    public static int price(String str) {
        if(str.equalsIgnoreCase(ForBirds.VITAMINS.getName())) { return 150; }
        if (str.equalsIgnoreCase(ForBirds.FOOD_FOR_CANARY.getName())){ return 400; }
        if (str.equalsIgnoreCase(ForBirds.FOOD_FOR_PARROTS.getName())) { return 350; }
        if(str.equalsIgnoreCase(ForBirds.CELL.getName())) { return 1500; }
        if(str.equalsIgnoreCase(ForBirds.DRINKING.getName())) { return 200; }
        if(str.equalsIgnoreCase(ForBirds.FEEDER.getName())){return 100;}
        if(str.equalsIgnoreCase(ForBirds.VENT.getName())){return 50;}
        if(str.equalsIgnoreCase(ForBirds.BELL.getName())){return 30;}

        if(str.equalsIgnoreCase(ForCats.DRY_FOOD.getName())){return 450; }
        if(str.equalsIgnoreCase(ForCats.WET_FOOD.getName())){return 200; }
        if(str.equalsIgnoreCase(ForCats.VITAMINS.getName())){return 300; }
        if(str.equalsIgnoreCase(ForCats.SET_OF_2BOWLS.getName())){return 350;}
        if(str.equalsIgnoreCase(ForCats.BEDROOM.getName())){return 1500;}
        if(str.equalsIgnoreCase(ForCats.TOILET_FILLER.getName())){return 900;}
        if (str.equalsIgnoreCase(ForCats.LITTLE_HOUSES.getName())){return 5500; }
        if(str.equalsIgnoreCase(ForCats.CLUTCH.getName())){return 2000; }

        if(str.equalsIgnoreCase(ForDogs.DRY_FOOD.getName())){return 500;}
        if(str.equalsIgnoreCase(ForDogs.WET_FOOD.getName())){return 250;}
        if(str.equalsIgnoreCase(ForDogs.VITAMINS.getName())){return 350;}
        if(str.equalsIgnoreCase(ForDogs.COLLAR.getName())){return 400; }
        if (str.equalsIgnoreCase(ForDogs.MUZZLE.getName())){return 350;}
        if (str.equalsIgnoreCase(ForDogs.LEAD.getName())){return 450;}
        if (str.equalsIgnoreCase(ForDogs.BEDROOM.getName())){return 2000;}
        if(str.equalsIgnoreCase(ForDogs.SET_OF_2BOWLS.getName())){return 500;}
        if(str.equalsIgnoreCase(ForDogs.BALL.getName())){return 250; }
        if (str.equalsIgnoreCase(ForDogs.BONE.getName())){return 300;}
        return 0;
    }
}

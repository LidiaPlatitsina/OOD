package OOD.IteratorAndVisitor.clothingStore.menDepartment;

public class Price {
    public static int menPrice(String str){
        if(str.equalsIgnoreCase(MenRange.BLAZER.getName())){return 2500; }
        if (str.equalsIgnoreCase(MenRange.PANTS.getName())){return 1000;}
        if (str.equalsIgnoreCase(MenRange.SHIRT.getName())){return 900;}
        if(str.equalsIgnoreCase(MenRange.TSHIRT.getName())){return 550;}
        return 0;
    }
}

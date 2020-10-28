package OOD.IteratorAndVisitor.clothingStore.womenDepartment;

public class Price {
    public static int womenPrice(String str){
        if(str.equalsIgnoreCase(WomenRange.BLOUSE.getName())){return 800;}
        if(str.equalsIgnoreCase(WomenRange.DRESS.getName())){return 2500;}
        if(str.equalsIgnoreCase(WomenRange.SKIRT.getName())){return 900;}
        if(str.equalsIgnoreCase(WomenRange.TROUSERS.getName())){return 1500;}
        if(str.equalsIgnoreCase(WomenRange.TSHIRT.getName())){return 350;}
        return 0;
    }
}

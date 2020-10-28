package OOD.IteratorAndVisitor.clothingStore.childrenDepartment;

public class Price {
    public static int kidsPrice(String str) {
        if (str.equalsIgnoreCase(KidsRange.BODYSUIT.getName())){return 250;}
        if (str.equalsIgnoreCase(KidsRange.BLOUSE.getName())){return 400;}
        if (str.equalsIgnoreCase(KidsRange.DRESS.getName())){return 900;}
        if (str.equalsIgnoreCase(KidsRange.SHIRT.getName())){return 350;}
        if (str.equalsIgnoreCase(KidsRange.TROUSERS.getName())){return 500;}
        if (str.equalsIgnoreCase(KidsRange.TSHIRT.getName())){return 200;}
        return 0;
    }
}

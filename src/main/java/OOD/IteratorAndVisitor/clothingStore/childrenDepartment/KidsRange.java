package OOD.IteratorAndVisitor.clothingStore.childrenDepartment;

public enum KidsRange {

    BODYSUIT("боди"),
    TSHIRT("футболка"),
    BLOUSE("кофта"),
    TROUSERS("штаны"),
    DRESS("платье"),
    SHIRT("рубашка");


    private String name;

    KidsRange(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

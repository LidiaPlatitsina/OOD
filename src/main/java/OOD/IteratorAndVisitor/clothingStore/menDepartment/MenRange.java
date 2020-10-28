package OOD.IteratorAndVisitor.clothingStore.menDepartment;

public enum  MenRange {

    TSHIRT("футболка"),
    SHIRT("рубашка"),
    PANTS("брюки"),
    BLAZER("пиджак");

    private String name;

    MenRange(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

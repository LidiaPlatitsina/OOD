package OOD.IteratorAndVisitor.clothingStore.womenDepartment;

public enum WomenRange {
    TSHIRT("футболка"),
    TROUSERS("штаны"),
    DRESS("платье"),
    SKIRT("юбка"),
    BLOUSE("блузка");

    private String name;

    WomenRange(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

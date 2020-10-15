package OOD.FacadeAndSingleton.search;

public enum Genre {
    IT("Про программистов"),
    KIDS("Для детей"),
    MATH("Про математиков");

    private String name;

    Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                '}';
    }
}

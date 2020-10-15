package OOD.FacadeAndSingleton.search;

public enum Type {
    cinema("Фильм"),
    series("Сериал");

    private String name;

    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                '}';
    }

}

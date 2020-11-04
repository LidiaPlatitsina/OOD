package OOD.State.state;

public enum StatusName
{
    START("Начало чтения"),
    PROCESS("В процессе чтения"),
    END("Книга прочитана");

    private String name;

    StatusName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

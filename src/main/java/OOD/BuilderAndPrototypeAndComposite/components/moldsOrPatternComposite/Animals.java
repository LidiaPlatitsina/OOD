package OOD.BuilderAndPrototypeAndComposite.components.moldsOrPatternComposite;

import java.util.List;

public class Animals extends Mold {
    private String format="3D";
    private int weight=250;

    public enum Animal
    {
        CAT("Кот"),BEAR("Медведь"),HARE("Заяц");

        private String name;

        Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public Animals(List<String> details,Animal name) {
        super(details,name.getName());
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getFormat() {
        return format;
    }
}

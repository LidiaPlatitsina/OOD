package OOD.BuilderAndPrototypeAndComposite.components.moldsOrPatternComposite;

import java.util.List;

public class Transport extends Mold {
    private String format="2D";
    private int weight=50;

    public enum NameTransport
    {
        CAR("Машина"),LOCOMOTIVE("Паровоз"),AIRCRAFT("Самолёт");

        private String name;

        NameTransport(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "NameTransport{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public Transport(List<String> details, NameTransport name) {
        super(details,name.getName());
    }

    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}

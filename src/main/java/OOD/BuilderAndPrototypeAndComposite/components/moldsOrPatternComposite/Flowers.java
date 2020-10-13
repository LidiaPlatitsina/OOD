package OOD.BuilderAndPrototypeAndComposite.components.moldsOrPatternComposite;

import java.util.List;

public class Flowers extends Mold {
    private String format="2D";
    private int weight=70;

    public enum Flower
    {
        ROSE("Роза"),TULIP("Тюльпан"),CHAMOMILE("Ромашка");

        private String name;

        Flower(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Flower{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public Flowers(List<String> details,Flower name)
    {
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

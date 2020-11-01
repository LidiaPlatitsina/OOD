package OOD.Observer;

import OOD.Observer.observer.Observer;
import OOD.Observer.reader.Reader;

public class Total {
    public static void main(String[] args) {
        Reader HarryPotter = new Reader("Гарри Поттер");
        Reader HarryPotter1 = new Reader("Гарри Поттер", "Гарри Поттер и Кубок огня (2000)");
        Reader HarryPotter2 = new Reader("Гарри Поттер",7);

        Reader ThreeMusketeers = new Reader("Три мушкетера");
        Reader ThreeMusketeers1 = new Reader("Три мушкетера",2);

        Reader SherlockHolmes = new Reader("Шерлок Холмс","Знак четырех (повесть, 1890)");
        Reader SherlockHolmes1 = new Reader("Шерлок Холмс",3);

        Observer observer = new Observer();
        observer.setNextBook(HarryPotter);
        observer.setNextBook(HarryPotter1);
        observer.setNextBook(HarryPotter2);
        System.out.print("\n");
        observer.setNextBook(ThreeMusketeers);
        observer.setNextBook(ThreeMusketeers1);
        System.out.print("\n");
        observer.setNextBook(SherlockHolmes);
        observer.setNextBook(SherlockHolmes1);
    }
}
package OOD.Decorator;

import OOD.Decorator.doors.*;

public class Total {
    public static void main(String[] args) {
        Door door = new Door(2050,860);
        System.out.println("Создание межкомнатной двери без стекляной вставки ");
        InteriorDoor inDoor = new InteriorDoor(door,"Дерево", "Дуб", false);
        inDoor.sizeOfGlassInsert(1500,600);
        System.out.println("Создание межкомнатной двери с стекляной вставкой ");
        InteriorDoor inDoor1 = new InteriorDoor(door,"Дерево", "Свектлый дуб", true);
        inDoor1.sizeOfGlassInsert(1500,600);
        System.out.println("Создание входной двери с ручкой на одной стороне");
        EntranceDoor entranceDoor = new EntranceDoor(door,false,"Сталь","Чёрный",3);
        System.out.println("Создание входной двери с ручами на обоих сторонах");
        EntranceDoor entranceDoor1 = new EntranceDoor(door,true,"Алюминий","Синий",1);
    }
}

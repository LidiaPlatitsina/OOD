package OOD.Flyweight;


import OOD.Flyweight.cubes.CubPoint;

public class Total {
    public static void main(String[] args) {
        CubPoint cubPoint = new CubPoint();
        String colors = "Красный Желтый Ораньжевый Розовый Караловый Малиновый";
        cubPoint.pointCub("One",colors);
        String colors1 = "Зеленый Синий Фиолетовый Коричневый Черный Серый";
        cubPoint.pointCub("Two",colors1);
        cubPoint.point();
    }
}

package OOD.TemplateMethod.arrays;

import java.util.Random;

public class DoubleArray extends AbArray {
    private double[] array;

    public DoubleArray(int len) {
        createAndFill(len);
    }


    @Override
    void createAndFill(int len) {
        array=new double[len];
        for (int i=0; i<array.length;i++)
        {
            array[i] = -10.0 + Math.random() * 20.0;
        }
    }

    @Override
    public void printArray() {
            System.out.println("Исходный массив");
            for (double elem: array) {
                System.out.format("%.2f  ",elem);
            }
            System.out.println();
            array =sort(array);
            System.out.println("Отсортированный массив");
            for (double elem1: array) {
                System.out.format("%.2f  ",elem1);
            }
            System.out.println();
            System.out.println();
    }
}

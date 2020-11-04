package OOD.TemplateMethod.arrays;

import java.util.Arrays;
import java.util.Random;

public class IntArray extends AbArray {
    public int[] array;

    public IntArray(int length) {
        createAndFill(length);
    }

    @Override
    void createAndFill(int len) {
        array=new int[len];
        Random random = new Random();
        for (int i=0; i<array.length;i++)
        {
            array[i] = -50 + random.nextInt(100);
        }
    }

    @Override
    public void printArray() {
        System.out.println("Исходный массив");
        for (int elem: array) {
            System.out.print(elem+" ");
        }
        System.out.println();
        toInt(sort(toDouble()));
        System.out.println("Отсортированный массив");
        for (int elem1: array) {
            System.out.print(elem1+" ");
        }
        System.out.println();
        System.out.println();
    }

    private double[] toDouble()
    { double[] arr= new double[array.length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (double) array[i];
        }
        return arr;
    }

    private void toInt(double[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            array[i] = (int) arr[i];
        }
    }
}

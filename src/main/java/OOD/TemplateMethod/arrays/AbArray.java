package OOD.TemplateMethod.arrays;


import java.util.Arrays;

public abstract class AbArray {
    AbArray(){}

    public static double[] sort(double[] array)
    {
        for (int i = 0; i < array.length ; i++) {
            double elem = array[i];
            int j = i-1;
            while (j>=0 && elem<array[j])
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = elem;
        }
        return array;
    }

    abstract void createAndFill(int len);
    public abstract void printArray();
}

package OOD.TemplateMethod;

import OOD.TemplateMethod.arrays.AbArray;
import OOD.TemplateMethod.arrays.DoubleArray;
import OOD.TemplateMethod.arrays.IntArray;

public class Total {
    public static void main(String[] args) {
        AbArray array = new IntArray(5);
        array.printArray();
        AbArray darray = new DoubleArray(5);
        darray.printArray();
    }

}

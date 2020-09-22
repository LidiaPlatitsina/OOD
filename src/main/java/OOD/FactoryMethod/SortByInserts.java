package OOD.FactoryMethod;

import java.util.Arrays;

public class SortByInserts implements Sort {
    private int[] array;

    public SortByInserts(int[] array1) {
        this.array = array1;
    }

    public int[] getArray() {
        return array;
    }


    @Override
    public void sort() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (key < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = key;
        }
    }

}

package OOD.Strategy;

import OOD.Strategy.sorter.Sorter;
import OOD.Strategy.strategy.BubbleSort;
import OOD.Strategy.strategy.InsertionSort;
import OOD.Strategy.strategy.SelectionSort;

public class Total {
    public static void main(String[] args) {
        int[] array = new int[]{7, 4, 1, 8, 5, 2, 0, 9, 6, 3};
        int[] array1 = new int[]{1, 4, 7, 2, 5, 8, 3, 0, 6, 9};
        int[] array2 = new int[]{6, 1, 4, 9, 0, 3, 5, 8, 7, 2};

        Sorter sorter = new Sorter(new BubbleSort());
        sorter.sortAndPrint(array);
        sorter.setSort(new InsertionSort());
        sorter.sortAndPrint(array1);
        sorter.setSort(new SelectionSort());
        sorter.sortAndPrint(array2);
    }
}

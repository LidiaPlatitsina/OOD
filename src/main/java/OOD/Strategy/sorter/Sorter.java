package OOD.Strategy.sorter;

import OOD.Strategy.strategy.SortStrategy;

public class Sorter {
    private SortStrategy sort;

    public Sorter(SortStrategy sort) {
        this.sort = sort;
    }

    public void setSort(SortStrategy sort) {
        this.sort = sort;
    }

    public void sortAndPrint(int[] array){
        System.out.println("Исходный массив");
        for (int elem: array) {
            System.out.print(elem+" ");
        }
        System.out.println();
        sort.sorting(array);
        System.out.println("Отсортированный массив");
        for (int elem1: array) {
            System.out.print(elem1+" ");
        }
        System.out.println();
        System.out.println();
    }
}

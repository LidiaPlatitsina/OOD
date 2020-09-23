package OOD.FactoryMethod;

public class FactoryMethod {

    public static void main(String[] args)
    {
        Sort sortFirst = new PyramidalSorting(7, 4, 1, 8, 5, 2, 0, 9, 6, 3);
        sortFirst.sort();
        Sort sortSecond = new SortByInserts(1, 4, 7, 2, 5, 8, 3, 0, 6, 9);
        sortSecond.sort();
        Sort sortThird = new CountingSort(7, 4, 1, 8, 5, 2, 0, 9, 6, 3);
        sortThird.sort();
    }

}

package OOD.FactoryMethod;

import org.junit.Assert;
import org.junit.Test;

public class SortsTest {
    @Test
    public void sortByInsertsTest() {
        int[] answer = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] first = {9, 0, 8, 5, 7, 6, 4, 2, 1, 3};
        SortByInserts sortFirst = new SortByInserts(first);
        int[] second = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        SortByInserts sortSecond = new SortByInserts(second);
        sortFirst.sort();
        Assert.assertTrue(flag(answer, sortFirst.getArray()));
        sortSecond.sort();
        Assert.assertTrue(flag(answer, sortSecond.getArray()));
    }

    @Test
    public void pyramidalSort() {
        int[] answer = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] first = {7, 4, 1, 8, 5, 2, 0, 9, 6, 3};
        PyramidalSorting sortFirst = new PyramidalSorting(first);
        int[] second = {1, 4, 7, 2, 5, 8, 3, 0, 6, 9};
        PyramidalSorting sortSecond = new PyramidalSorting(second);
        sortFirst.sort();
        Assert.assertTrue(flag(answer, sortFirst.getArray()));
        sortSecond.sort();
        Assert.assertTrue(flag(answer, sortSecond.getArray()));
    }

    @Test
    public void countingSort() {
        int[] answer = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] first = {1, 5, 9, 3, 7, 6, 4, 2, 8, 0};
        CountingSort sortFirst = new CountingSort(first);
        int[] second = {5, 8, 3, 6, 2, 4, 7, 9, 1, 0};
        CountingSort sortSecond = new CountingSort(second);
        sortFirst.sort();
        Assert.assertTrue(flag(answer, sortFirst.getArray()));
        sortSecond.sort();
        Assert.assertTrue(flag(answer, sortSecond.getArray()));
    }

    public static boolean flag(int[] array, int[] array1) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array1[i]) {
                return false;
            }
        }
        return true;
    }

}

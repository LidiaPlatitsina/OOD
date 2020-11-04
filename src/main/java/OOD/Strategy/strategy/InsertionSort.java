package OOD.Strategy.strategy;

public class InsertionSort implements SortStrategy {
    @Override
    public void sorting(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            int elem = array[i];
            int j = i-1;
            while (j>=0 && elem<array[j])
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = elem;
        }
        System.out.println("Сортировка вставками");
    }
}

package OOD.Strategy.strategy;

public class SelectionSort implements SortStrategy {
    @Override
    public void sorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length ; j++) {
                if(array[j]<min)
                {
                    min = array[j];
                    minId =j;
                }

            }
            int elem = array[i];
            array[i] = min;
            array[minId] = elem;
        }
        System.out.println("Сортировка выбором");
    }
}

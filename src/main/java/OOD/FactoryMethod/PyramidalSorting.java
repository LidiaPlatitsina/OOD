package OOD.FactoryMethod;

public class PyramidalSorting implements Sort {
    private int[] array;

    public PyramidalSorting(int[] array1) {
        this.array = array1;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public void sort() {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heap(array, array.length, i);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int flag = array[0];
            array[0] = array[i];
            array[i] = flag;
            heap(array, i, 0);
        }

    }

    void heap(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heap(arr, n, largest);
        }
    }
}

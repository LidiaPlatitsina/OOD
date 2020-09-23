package OOD.FactoryMethod;

public class CountingSort implements Sort {
    private int[] array;

    public CountingSort(Integer...array1) {
       array = new int[array1.length];
       for (int i=0;i<array1.length;i++)
       {
           array[i]=array1[i];
       }
    }


    @Override
    public void sort() {
        int max;
        max = array[0];
        for (int elem : array) {
            if (elem > max) {
                max = elem;
            }
        }
        int[] numCount = new int[max + 1];
        for (int num : array) {
            numCount[num]++;
        }
        int[] result = new int[array.length];
        int indexArr = 0;
        for (int i = 0; i < numCount.length; i++) {
            int count = numCount[i];
            for (int j = 0; j < count; j++) {
                result[indexArr] = i;
                indexArr++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            array[i] = result[i];
        }
    }
}

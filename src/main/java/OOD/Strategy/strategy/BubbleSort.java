package OOD.Strategy.strategy;

public class BubbleSort implements SortStrategy {

    @Override
    public void sorting(int[] array) {
        boolean flag = false;
        int elem;
        while (!flag)
        {
            flag = true;
            for (int i = 0; i <array.length-1 ; i++) {
                if(array[i]>array[i+1]){
                   elem=array[i];
                   array[i]=array[i+1];
                   array[i+1]=elem;
                   flag = false;
                }
            }
        }
        System.out.println("Сортировка пузырьком");
    }
}

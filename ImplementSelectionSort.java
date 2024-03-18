import java.util.Arrays;

public class ImplementSelectionSort {

    public static void main(String[] args){
        Integer [] arrayToSort = {4, 1, 2, 5};
        System.out.println(Arrays.toString(arrayToSort));
        selectionSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }

    private static void selectionSort(Integer[] arrayToSort) {
        Integer sizeOfArrayToSort = arrayToSort.length;
        Integer minNumberIndex = 0;
        for(int i = 0; i < sizeOfArrayToSort - 2; i++){
            minNumberIndex = i;
            for(int j = i+1; j < sizeOfArrayToSort-1; j++){
                if (arrayToSort[j] < arrayToSort[minNumberIndex]){
                    minNumberIndex = j;
                }
            }
            Integer tempSwapVariable = arrayToSort[minNumberIndex];
            arrayToSort[minNumberIndex] = arrayToSort[i];
            arrayToSort[i] = tempSwapVariable;
        }

    }

}

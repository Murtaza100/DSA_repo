public class App {

    public static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        int[] arr = {2,5,7,3,1,9,4,0};
        // BubbleSort bs = new BubbleSort();
        // bs.bubbleSort(arr);

        // SelectionSort ss = new SelectionSort();
        // ss.selectionSort(arr);

        // InsertionSort is = new InsertionSort();
        // is.insertionSort(arr);

        // MergeSort ms = new MergeSort();
        // ms.mergeSort(arr, 0, arr.length-1);

        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length-1);

        printArray(arr);
    }
}

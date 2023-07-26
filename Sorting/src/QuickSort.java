public class QuickSort {
    public void quickSort(int[] ar, int l, int r) {
        if(r>l) {
            int pivot = partition(ar, l, r);
            quickSort(ar, l, pivot-1);
            quickSort(ar, pivot+1, r);
        }
    }
    public int partition(int[] arr, int l, int r) {
        int pivot = r;
        int i = l-1;
        for(int j=l; j<=r; j++) {
            if(arr[j]<=arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }
}

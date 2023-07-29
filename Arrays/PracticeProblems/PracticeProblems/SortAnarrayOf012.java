// Dutch national flag algorithm

public class SortAnarrayOf012 {
    public static void sort(int[] arr) {
        int low=0, high=arr.length-1, mid=0, temp;
        while(mid<=high) {
            if(arr[mid] == 0) { // if arr[mid] == 0
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++; low++;
            }
            else if(arr[mid] == 1) { // if arr[mid] == 0
                mid++;
            }
            else {              // if arr[mid] == 2
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,2,0,0,2,1,1,1,0};
        sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}

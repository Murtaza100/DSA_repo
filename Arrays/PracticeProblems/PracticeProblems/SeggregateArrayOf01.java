public class SeggregateArrayOf01 {

    public static void seggregateArray(int[] ar) {
        int i=0,j=ar.length-1;
        while(i<j) {
            while(ar[i]==0 && i<j) {
                i++;
            }
            while(ar[j]==1 && i<j) {
                j--;
            }
            if(i<j) {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                i++; j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,0,1,1,1,0};
        seggregateArray(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}

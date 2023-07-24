public class ArrayProduct {
    public static void main(String[] args) {
        int[] a = {1,2,5,3,4};
        System.out.println(productofArray(a,5));
    }
    public static int productofArray(int A[], int N) 
    { 
        if(N==1){
            return A[N-1];
        }
        return A[N-1] * productofArray(A, N-1);
    
    } 

}

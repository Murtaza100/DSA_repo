public class ReverseMatrix {
    public static void reverse(int[][] ar){
        for(int i=0; i<ar.length; i++){
            int left = 0, right = ar[0].length-1;
            while(left<right){
                int temp = ar[i][right];
                ar[i][right] = ar[i][left];
                ar[i][left] = temp;
                left++;
                right--;
            }
        }
       
    }
    public static void printMatrix(int [][] ar) {
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar[0].length; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] ar = {
            {1,2,3,4},
            {4,5,6,7},
            {7,8,9,0}
        };
        System.out.println("Original Matrix :");
        printMatrix(ar);
        System.out.println("Reversed Matrix :");
        reverse(ar);
        printMatrix(ar);
    }
}
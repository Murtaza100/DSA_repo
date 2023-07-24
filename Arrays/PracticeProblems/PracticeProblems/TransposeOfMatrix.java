public class TransposeOfMatrix {
    //using same array -> no extra space used
    public static void transpose(int [][] ar) {
        for(int i = 0; i< ar.length-1; i++){
            for(int j = i+1; j<ar.length; j++){
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
    }
    //using extra space of O(n^2)
    public static int [][] transposeUsingExtraSpace(int [][] ar){
        int[][] res = new int[ar.length][ar.length];
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar.length; j++){
                res[i][j] = ar[j][i];
            }
        }
        return res;
    }
    public static void printMatrix(int [][] ar) {
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar.length; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] ar = { {1,2,3},
                        {4,5,6},
                        {7,8,9} };
        System.out.println("Original Matrix : ");
        printMatrix(ar);
        System.out.println("Transposed Matrix : ");
        //transpose(ar);
        //printMatrix(ar);
        printMatrix(transposeUsingExtraSpace(ar));
    }
}

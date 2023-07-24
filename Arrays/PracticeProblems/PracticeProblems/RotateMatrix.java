/*
 * 48- Rotate image - leetcode
 * Rotate Matrix
Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[7,4,1],[8,5,2],[9,6,3]]
 */
public class RotateMatrix {
    
    public static void rotate(int[][] ar) {
        //Transpose
       for(int i = 0; i< ar.length-1; i++){
           for(int j = i+1; j<ar.length; j++){
               int temp = ar[i][j];
               ar[i][j] = ar[j][i];
               ar[j][i] = temp;
           }
       }
       //Reverse 
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
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    System.out.println("Original Matrix :");
    printMatrix(ar);
    System.out.println("Rotaed Matrix :");
    rotate(ar);
    printMatrix(ar);
   }
}

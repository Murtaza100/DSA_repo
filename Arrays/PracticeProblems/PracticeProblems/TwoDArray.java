// package PracticeProblems;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Given 2D array calculate the sum of diagonal elements.

Example

myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 
sumDiagonalElements(myArray2D) # 15 */

public class TwoDArray {
    public static int sumDiagonalElements(int[][] array) {
 
        int sum = 0;
        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[0].length; col++){
                if(row==col)
                    sum += array[row][col];
            }
        }
        // also can be done by one for loop
        // for (int i = 0; i < array.length; i++) {
        //     sum += array[i][i];
        // }
        return sum;
    }
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,m;
        String[] strRowColumn = br.readLine().split(" ");
        n=Integer.parseInt(strRowColumn[0]);
        m=Integer.parseInt(strRowColumn[1]);
        int arr[][] = new int[n][m];
        String[] strInput = br.readLine().split(" ");
        int inp = 0;
        while(inp<strInput.length){
             for(int row=0;row<n;row++) {
                for(int col = 0; col<m; col++){
                     arr[row][col]=Integer.parseInt(strInput[inp]);
                     inp++;
                }
            }
        }
        System.out.print(sumDiagonalElements(arr));
    }
}

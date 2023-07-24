/*
 * Given an array, write a function to get first, second best scores from the array and return it in new array.

Array may contain duplicates.

Example

myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87}
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BestScore {
    
    public static int[] findTopTwoScores(int[] array){
        int firstHigh = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for(int curScore:array){
            if(curScore>firstHigh){
                secondHighest=firstHigh;
                firstHigh=curScore;
            }
            else if(curScore>secondHighest && curScore<firstHigh){
                secondHighest=curScore;
            }
        }
        return new int [] {firstHigh,secondHighest};
      
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        for(int ans : findTopTwoScores(arr)){
            System.out.print(ans+ " ");
        } 
    }
}

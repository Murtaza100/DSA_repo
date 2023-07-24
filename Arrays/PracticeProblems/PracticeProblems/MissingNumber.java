/*
 * Missing Number
Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

Example

myArray = {1,2,3,4,6}
findMissingNumberInArray(myArray, 6) // output -> 5
Hint:

Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MissingNumber {

    static int findMissingNumberInArray(int[] arr) {
        int n = arr.length+1;
        int sum = 0;
        int totalSum = (n * (n+1)) / 2;
        for(int i=0; i<n-1; i++){
            sum+= arr[i];
        }
        return totalSum-sum;
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
       System.out.println(findMissingNumberInArray(arr));
    }
}
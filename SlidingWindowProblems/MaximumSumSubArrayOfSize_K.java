/*
 * Given an array of integers and a number k, find the maximum sum of 
 * a subarray of size k. 

Examples: 
----------
Input  : arr[] = {100, 200, 300, 400},  k = 2
Output : 700

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
Output : 39
Explanation: We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSumSubArrayOfSize_K {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int k=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        System.out.println(calcMaxSum(arr,k));
    }

    private static int calcMaxSum(int[] arr, int k) {
        int i=0,j=0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while(j<arr.length) {
            sum = sum + arr[j];
            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum = sum - arr[i];
                i++; j++;
            }
        }
        return maxSum;
    }
}
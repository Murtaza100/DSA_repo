/*
 * Longest sub-array having sum k (array contains 0 and +ve only)
--------------------------------------

Given an array arr[] of size n containing integers. The problem 
is to find the length of the longest sub-array having sum equal
to the given value k.

Examples: 
-----------
Input: arr[] = { 10, 5, 2, 7, 1, 9 }, k = 15
Output: 4
Explanation: The sub-array is {5, 2, 7, 1}.

Input: arr[] = {1 ,2 ,1 ,0 ,1}, k = 4
Output: 4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestSubarrayofsumK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int k=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        System.out.println(findMaxSumSubArray(arr,k));
    }

    private static int findMaxSumSubArray(int[] arr, int k) {
        int i=0, j=0, sum=0, count=0, maxCount=0;
        while(j<arr.length) {
            sum = sum + arr[j];
            if(sum < k) 
                j++;
            else if(sum == k) {
                count = j-i+1;
                maxCount = Math.max(count, maxCount);
                j++;
            }
            else {
                while(sum > k) {
                    sum = sum - arr[i];
                    i++;
                }
                j++;
            }
        }
        return maxCount;
    }
}

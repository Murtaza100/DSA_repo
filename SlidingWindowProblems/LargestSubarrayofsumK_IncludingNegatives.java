/*
 * Longest sub-array having sum k (array contains 0, +ve and -ve)
------------------------------------------------------------------

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

Input: arr[] = {-5, 8, -14, 2, 4, 12}, k = -5
Output: 5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayofsumK_IncludingNegatives {
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
        int maxLength = 0, sum=0;
        Map<Integer, Integer> sumCount = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(sum == k)
                maxLength = i+1;
            if(sumCount.containsKey(sum-k)){
                maxLength = Math.max(maxLength, i-sumCount.get(sum-k));
            }
            if(!sumCount.containsKey(sum)){
                sumCount.put(sum, i);
            }
        }
        return maxLength;
    }
}

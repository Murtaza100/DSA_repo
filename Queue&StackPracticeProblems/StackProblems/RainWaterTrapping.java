/*
 * Given an array of N non-negative integers arr[] representing 
 * an elevation map where the width of each bar is 1, compute 
 * how much water it is able to trap after raining.

Examples:  
----------
Input: arr[] = {2, 0, 2}
Output: 2
Explanation: The structure is like below.
We can trap 2 units of water in the middle gap.

Input: arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}
Output: 6
Explanation: The structure is like below.
Trap “1 unit” between first 1 and 2, “4 units” between
first 2 and 3 and “1 unit” between second last 1 and last 2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RainWaterTrapping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        //System.out.println(TrappedWater(arr));
        System.out.println(OptimisedTrappedwater(arr));
    }

    // two pointer approach, TC-O(N), SC-O(1)
    private static int OptimisedTrappedwater(int[] arr) {
        int maxWater = 0;
        int n = arr.length;
        int l = 0, r = n-1, 
        leftMax = arr[0], rightMax = arr[n-1];
        while(l <= r) {
            if(leftMax <= rightMax) {
                if(arr[l]>=leftMax)
                    leftMax=arr[l];
                else
                    maxWater += leftMax - arr[l];
                l++;
            }
            else {
                if(arr[r] >= rightMax)
                    rightMax =arr[r];
                else
                    maxWater += rightMax - arr[r];
                r--;
            }
        }
        return maxWater;
    }


    // TC - (N), SC - 0(N)
    private static int TrappedWater(int[] arr) {
        int n = arr.length;
        int maxWater = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = arr[0];
        rightMax[n-1] = arr[n-1];
        for(int i=1; i<n; i++) {
            if(arr[i]>leftMax[i-1]) 
                leftMax[i] = arr[i];
            else 
                leftMax[i] = leftMax[i-1];   
            //leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        for(int i=0; i<n; i++) {
            maxWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        return maxWater;
    }
}

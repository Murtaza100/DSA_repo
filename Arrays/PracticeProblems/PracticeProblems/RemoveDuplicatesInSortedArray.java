/*
 * Remove Duplicates from Sorted Array - LeetCode 26
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Input: nums = [1, 1, 2] 
Output: 2
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RemoveDuplicatesInSortedArray {
    public static int removeDuplicates(int[] nums) {
        int i = 0; // finally fives index till unique ele is present
        for(int j=1; j<nums.length; j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
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
        System.out.println(removeDuplicates(arr));
         
    }
}

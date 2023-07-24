/*
IsUnique / Contains Duplicate - LeetCode 217
--------------------------------------------------
 * Given an integer array nums, return true if any value appears at least twice 
 * in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.IOException;

public class IsUniqueOrContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        HashMap <Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        for(Integer i:mp.values()){
            if (i > 1){
                flag= true;
                break;
            }   
        }
        return flag;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        System.out.println(containsDuplicate(arr));
    }
}
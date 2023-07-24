/*
 * Two Sum - LeetCode 1
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.

Examples

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]


Input: nums = [3,2,4], target = 6
Output: [1,2]
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TwoSumLeetCodeI {
    public static int[] twoSum(int[] nums, int target) {
    
    Map<Integer,Integer> mp = new HashMap<>();
    for(int i=0; i<nums.length; i++){
        int operand2 = target - nums[i];
        if(mp.containsKey(operand2)){
            return new int[]{mp.get(operand2),i};
        }
        else{
            mp.put(nums[i],i);
        }
    }
    return new int[]{-1,-1};
}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,k;
        String[] sizeAndTarget = br.readLine().split(" ");
        n=Integer.parseInt(sizeAndTarget[0]);
        k=Integer.parseInt(sizeAndTarget[1]);
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        for(int i : twoSum(arr,k)){
            System.out.print(i + " ");
        }
    }
}

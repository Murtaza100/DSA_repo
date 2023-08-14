/*
 * Divide and Conquer - sortedFrequency
 * --------------------------------------
Given a sorted array and a number, write a function called sortedFrequency that 
counts the occurrences of the number in the array.

sortedFrequency([1, 1, 2, 2, 2, 2, 3], 2) # 4
sortedFrequency([1, 1, 2, 2, 2, 2, 3], 3) # 1
sortedFrequency([1, 1, 2, 2, 2, 2, 3], 4) # -1
sortedFrequency([], 4) # -1
Time Complexity - O(log n)
 */

public class CountFreq {
    public static int countSortedFrequency(int[] arr, int num) {
        int left=0, right =arr.length-1;
        int leftCount=0, rightCount=0;
        while(left <= right) {
            int mid = (left+right)/2;
            if(arr[mid] == num) {
                leftCount=mid;
                rightCount=mid;
                while(leftCount>=0 && arr[leftCount]==num){
                    leftCount--;
                }
                while(rightCount<arr.length && arr[rightCount]==num) {
                    rightCount++;
                }
                return rightCount-leftCount-1;
            }
            else if(arr[mid] > num) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return -1;
    }
}

/*
 * Divide and Conquer - countZeroes
 * ----------------------------------
Given an array of 1s and 0s which has all 1s first followed
 by all 0s, write a function called countZeroes, which returns 
 the number of zeroes in the array.

countZeroes([1,1,1,1,0,0]) # 2
countZeroes([1,0,0,0,0]) # 4
countZeroes([0,0,0]) # 3
countZeroes([1,1,1,1]) # 0

Time Complexity - O(log n)
 */

public class CountZeroes {
    // method 1 : using binary search
        public static int countZeroes(int[] array) {
            int start = 0;
            int end = array.length-1;
            while(start<=end) {
                int mid = (start+end)/2;
                if(array[mid] == 1){
                    start = mid+1;
                    
                }
                else {
                    end = mid-1;
                }
            }
            return array.length-start;
        }
    // methid 2 : without binary serach
        public static int countZeroes(int[]arr, int i) {
           if(i<0)
               return 0;

           if(arr[i] == 0)
               return 1+countZeroes(arr,i-1);
           else {
               return 0;
           }
           
         }
}

/*
 * Divide and Conquer - findRotatedIndex
 * ---------------------------------------
Write a function called findRotatedIndex which accepts a rotated array 
of sorted numbers and an integer. The function should return the index 
of the integer in the array. If the value is not found, return -1.

Constraints:

Time Complexity - O(log n)

Space Complexity - O(1)

findRotatedIndex([3, 4, 1, 2], 4) # 1
findRotatedIndex([4, 6, 7, 8, 9, 1, 2, 3, 4], 8) # 3
findRotatedIndex([6, 7, 8, 9, 1, 2, 3, 4], 3) # 6
findRotatedIndex([37, 44, 66, 102, 10, 22], 14) # -1
findRotatedIndex([6, 7, 8, 9, 1, 2, 3, 4], 12) # -1
findRotatedIndex([11, 12, 13, 14, 15, 16, 3, 5, 7, 9], 16) # 5
findRotatedIndex([11, 12, 13, 17, 39], 17) # 3
findRotatedIndex([11], 11) # 0
findRotatedIndex([], 11) # -1
findRotatedIndex([4, 4, 4, 4, 4], 5) # -1
 */

public class FindRotatedIndex {
    public static int findRotatedIndex(int[] arr, int num) {
        int l=0, r=arr.length-1, mid=0;
        while(l<=r) {
            mid = (l+r)/2;
            if(arr[mid] == num)
                return mid;
            else if(arr[l] <= arr[mid]) // left sorted array
            {
                if(num >= arr[l] && num < arr[mid]) 
                {
                    r=mid-1;
                }
                else 
                    l=mid+1;
            }
            else { // right sorted array
                if(num>arr[mid] && num <= arr[r])
                {
                    l=mid+1;
                }
                else
                    r=mid-1;
            }
        }
        return -1;

      }
}

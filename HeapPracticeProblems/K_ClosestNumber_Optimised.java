/*
 * K Closest Numbers
 * -------------------
 * Given a sorted integer array arr, two integers k and x, return the k closest 
 * integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b
 

Example 1:
----------
Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
Example 2:
-----------
Input: arr = [1,2,3,4,5], k = 4, x = -1
Output: [1,2,3,4]
 */

// Note - Optimised approach
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class K_ClosestNumber_Optimised {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] kx = br.readLine().split(" ");
        int k = Integer.parseInt(kx[0]);
        int x = Integer.parseInt(kx[1]);
        String[] arrayInput = br.readLine().split(" ");
        for(int i=0; i<arrayInput.length; i++) {
            arr[i] = Integer.parseInt(arrayInput[i]);
        }
        List<Integer> result= findClosestNumber(arr,k,x);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> findClosestNumber(int[] ar, int k, int x) {
        List<Integer> list = new ArrayList<>();

        //implement binary search to find mid, since array is already sorted
        int low=0, high=ar.length-1;
        int mid = 0;
        while(low<=high) {
            mid = (low+high)/2;
            if(ar[mid] == x)
                break;
            else if(ar[mid] > x)
                high = mid-1;
            else
                low = mid+1;
        }

        // logic to get k elements
        int l = mid-1, r = mid;
        while(l>=0 && r<ar.length && k>0) {
            if(Math.abs(ar[l]-x) > Math.abs(ar[r]-x)) {
                list.add(ar[r]);
                r++;
            }
            else {
                list.add(ar[l]);
                l--;
            }
            k--;
        }

        while(k>0 && l>=0) {
            list.add(ar[l]);
            l--; k++;
        }

        while(k>0 && r<ar.length) {
            list.add(ar[r]);
            r++;
            k--;
        }

        Collections.sort(list);
        return list;
    }
}

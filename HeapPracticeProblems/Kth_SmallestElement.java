/*
 * Given an array and a number k where k is smaller than size of array, 
 * we need to find the k’th smallest element in the given array. 
 * It is given that all array elements are distinct.

Example:
Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 3
Output: 7 . 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_SmallestElement {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int k = Integer.parseInt(br.readLine());
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        System.out.println(findSmallestEle(arr,k));
    }

    private static int findSmallestEle(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<arr.length; i++) {
            maxHeap.offer(arr[i]);
            if(maxHeap.size() > k)
                maxHeap.poll();
        }
        return maxHeap.peek();
    }
}

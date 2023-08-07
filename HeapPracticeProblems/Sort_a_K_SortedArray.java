/* Sort a k sorted array/ Nearly sorted array
------------------------------------------------
 * Given an array of n elements, where each element is at most k away 
 * from its target position, devise an algorithm that sorts in O(n log k)
 * time. For example, let us consider k is 2, an element at index 7 
 * in the sorted array, can be at indexes 5, 6, 7, 8, 9 in the given array.

Example:
Input : arr[] = {6, 5, 3, 2, 8, 10, 9}
k = 3 
Output : arr[] = {2, 3, 5, 6, 8, 9, 10} . 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Sort_a_K_SortedArray {
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
        for(int i :sortArray(arr,k)) {
            System.out.print(i+" ");
        }
    }

    private static ArrayList<Integer> sortArray(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++) {
            minHeap.offer(arr[i]);
            if(minHeap.size() > k) {
                // {6, 5, 3, 2, 8, 10, 9}
                result.add(minHeap.poll());
            }
        }
        for(Integer i : minHeap) {
            result.add(i);
        }
        return result;
    }

}

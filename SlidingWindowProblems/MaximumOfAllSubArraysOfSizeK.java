/*
Sliding Window Maximum (Maximum of all subarrays of size K)
------------------------------------------------------------
 * Given an array and an integer K, find the maximum for each and 
 * every contiguous subarray of size K.

Examples : 
----------
Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3 
Output: 3 3 4 5 5 5 6
Explanation: Maximum of 1, 2, 3 is 3
                       Maximum of 2, 3, 1 is 3
                       Maximum of 3, 1, 4 is 4
                       Maximum of 1, 4, 5 is 5
                       Maximum of 4, 5, 2 is 5 
                       Maximum of 5, 2, 3 is 5
                       Maximum of 2, 3, 6 is 6

Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4 
Output: 10 10 10 15 15 90 90          
Explanation: Maximum of first 4 elements is 10, similarly for next 4 
                elements (i.e from index 1 to 4) is 10, So 
                the sequence generated is 10 10 10 15 15 90 90
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
//import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumOfAllSubArraysOfSizeK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int k=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        for(int i : findMaximum(arr,k)) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> findMaximum(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        // using maxHeap
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // int i=0, j=0;
        // while(j<arr.length) {
        //     pq.offer(arr[j]);
        //     if(j-i+1 < k)
        //         j++;
        //     else if(j-i+1 == k) {
        //         list.add(pq.peek());
        //         if(arr[i] == pq.peek()) {
        //             pq.poll();
        //         }
        //         i++;j++;
        //     }
        // }

        // using linkedlist
        Queue<Integer> storeMax = new LinkedList<>();
        int i=0, j=0;
        while(j<arr.length) {
            while(!storeMax.isEmpty() && storeMax.peek()<arr[j]){
                storeMax.poll();
            }
            storeMax.offer(arr[j]);
            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k) {
                list.add(storeMax.peek());
                if(arr[i] == storeMax.peek()) {
                    storeMax.poll();
                }
                i++;j++;
            }
        }
        return list;
    }
}

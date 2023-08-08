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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class K_ClosestNumber {

    static class Pair implements Comparable<Pair> {
        int value;
        int  gap;
    
        public Pair(int value, int gap) {
            this.value = value;
            this.gap = gap;
        }
    
        @Override
        public int compareTo(Pair o) {
            if(this.gap == o.gap)
                return this.value - o.value;
            else
                return this.gap - o.gap;
        }
    
    }
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int k = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        List<Integer> result = findClosestElements(arr,k,x);
        for(int i : result) {
            System.out.print(i+" ");
        }
    }


    // using heap
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<arr.length; i++) {
            maxHeap.offer(new Pair (arr[i], Math.abs(arr[i]-x)));
            if(maxHeap.size() > k)
                maxHeap.poll();
        }
        while(maxHeap.size()>0) {
            list.add(maxHeap.peek().value);
            maxHeap.poll();
        }
        Collections.sort(list);
        return list;
    }
}

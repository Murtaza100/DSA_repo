/*
 * Top K Frequent Elements
----------------------------
Given an integer array nums and an integer k, return the k 
most frequent elements. You may return the answer in any order.

Example 1:
-----------
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:
-----------
Input: nums = [1], k = 1
Output: [1]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_FrequentNumbers {

    public static class Pair implements Comparable<Pair> {
        int value;
        int  frequency;
    
        public Pair(int value, int frequency) {
            this.value = value;
            this.frequency = frequency;
        }
    
        @Override
        public int compareTo(Pair o) {
                return this.frequency - o.frequency;
        }
    
    }
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n , k;
        String[] nk = br.readLine().split(" ");
        n = Integer.parseInt(nk[0]);
        k = Integer.parseInt(nk[1]);
        String[] arrInput = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n ; i++) {
            arr[i] = Integer.parseInt(arrInput[i]);
        } 
        for(int i : findFrequentNumbers(arr, k)) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> findFrequentNumbers(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> freqCount = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            freqCount.put(arr[i], freqCount.getOrDefault(arr[i], 0)+1);
        }
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();
        for(Map.Entry<Integer,Integer> e : freqCount.entrySet()) {
            minHeap.offer(new Pair(e.getKey(), e.getValue()));
            if(minHeap.size() > k)
                minHeap.poll();
        }
        while(minHeap.size()>0) {
            list.add(minHeap.peek().value);
            minHeap.poll();
        }
        return list;
    }
}

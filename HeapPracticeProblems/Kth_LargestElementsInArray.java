/*
 * Write an efficient program for printing k largest elements in an array.
 * Elements in array can be in any order.

For example, if given array is [1, 23, 12, 9, 30, 2, 50] 
and you are asked for the largest 3 elements i.e., k = 3 
then your program should print 23, 30 and 50. . 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Kth_LargestElementsInArray {
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
        for(int i :findLargestElements(arr,k)) {
            System.out.print(i+" ");
        }
    }

    private static int[] findLargestElements(int[] arr, int k) {
        int[] result = new int[k];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++) {
            minHeap.offer(arr[i]);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        for(int i=0; i<k; i++) {
            result[i] = minHeap.peek();
            minHeap.poll();
        }
        return result;
    }

}

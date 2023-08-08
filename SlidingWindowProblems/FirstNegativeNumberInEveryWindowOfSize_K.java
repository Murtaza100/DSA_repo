/*
 * First negative integer in every window of size k
------------------------------------------------------

Given an array and a positive integer k, find the first negative 
integer for each window(contiguous subarray) of size k. If a 
window does not contain a negative integer, then print 0 for 
that window.

Examples:  
---------
Input : arr[] = {-8, 2, 3, -6, 10}, k = 2
Output : -8 0 -6 -6

First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6

Input : arr[] = {12, -1, -7, 8, -15, 30, 16, 28} , k = 3
Output : -1 -1 -7 -15 -15 0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumberInEveryWindowOfSize_K {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int k=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        for(int i : calcNegatives(arr,k)) {
            System.out.print(i + " ");
        }
    }

    private static List<Integer> calcNegatives(int[] arr, int k) {
        List<Integer> negatives = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int i=0, j=0;
        while(j<arr.length) {
            if(arr[j] < 0)
                negatives.add(arr[j]);
            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k) {
                if(negatives.size()>0) {
                    result.add(negatives.get(0));
                    if(arr[i] == negatives.get(0)) {
                        negatives.remove(0);
                    }
                    
                }
                else
                    result.add(0);
                
                i++; j++;
            }
        }
        return result;
    }

}

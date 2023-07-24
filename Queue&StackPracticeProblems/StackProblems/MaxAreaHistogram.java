/*
 * Max Area in Histogram:
 * -----------------------
 * Find the largest rectangular area possible in a given histogram where 
 * the largest rectangle can be made of a number of contiguous bars whose
 *  heights are given in an array. For simplicity, assume that all bars 
 * have the same width and the width is 1 unit. 

Example: 
---------
Input: histogram = {6, 2, 5, 4, 5, 1, 6}
Output: 12

Input: histogram = {3, 5, 1, 7, 5, 9}
Output: 15
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        System.out.println(calcArea(arr));
    }

    private static int calcArea(int[] arr) {
        int maxArea = 0;
        LinkedList<Integer> nextSmallerRight = nextSmallerRight(arr);
        LinkedList<Integer> nextSmallerLeft = nextSmallerLeft(arr);
        for(int i=0; i<arr.length; i++) {
            int area = (nextSmallerRight.get(i) - 
            nextSmallerLeft.get(i) -1) * arr[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    private static LinkedList<Integer> nextSmallerRight(int[] arr) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=n-1; i>=0; i--) {
            if(st.empty()) {
                result.addFirst(n);
            }
            else if(!st.empty() && arr[i]>arr[st.peek()]) {
                result.addFirst(st.peek());
            }
            else {
                while(!st.empty() && arr[i]<arr[st.peek()]) {
                    st.pop();
                    if(st.empty()) {
                        result.addFirst(n);
                    }
                    else if(arr[i]>arr[st.peek()]) {
                        result.addFirst(st.peek());
                    }
                }
            }
            st.push(i);
        }
        return result;
    }

    private static LinkedList<Integer> nextSmallerLeft(int[] arr) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(st.empty()) {
                result.add(-1);
            }
            else if(!st.empty() && arr[i]>arr[st.peek()]) {
                result.add(st.peek());
            }
            else {
                while(!st.empty() && arr[i]<arr[st.peek()]) {
                    st.pop();
                    if(st.empty()) {
                        result.add(-1);
                    }
                    else if(arr[i]>arr[st.peek()]) {
                        result.add(st.peek());
                    }
                }
            }
            st.push(i);
        }
        return result;
    }
}

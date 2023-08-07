/*
 * Given a binary matrix, find the maximum size rectangle binary-sub-matrix 
 * with all 1’s. 

Example: 
--------------

Input:
0 1 1 0
1 1 1 1
1 1 1 1
1 1 0 0
Output :
8
Explanation : 
The largest rectangle with only 1's is from 
(1, 0) to (2, 3) which is
1 1 1 1
1 1 1 1 

Input:
0 1 1
1 1 1
0 1 1      
Output:
6
Explanation : 
The largest rectangle with only 1's is from 
(0, 1) to (2, 2) which is
1 1
1 1
1 1
 */

import java.util.LinkedList;
import java.util.Stack;

public class MaxAreaRectangleInBinaryMatrix {

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
                while(!st.empty() && arr[i]<=arr[st.peek()]) {
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
                while(!st.empty() && arr[i]<=arr[st.peek()]) {
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
    public static void main(String[] args) {
        int arr[][] = {
            { 0, 1, 1, 0 },
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 },
            { 1, 1, 0, 0 },
        };
        int ar[] = arr[0];
        int maxArea = calcArea(ar);
        for(int i=1; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == 0)
                    ar[j]=0;
                else
                    ar[j]=ar[j] + arr[i][j];
            }
            maxArea = Math.max(maxArea, calcArea(ar));
        }
        System.out.println(maxArea);
    }
}

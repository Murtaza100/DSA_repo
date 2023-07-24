/*
 * The stock span problem 
 * ---------------------------
 * It is a financial problem where we have a series 
 * of N daily price quotes for a stock and we need to calculate the span 
 * of the stock’s price for all N days. The span Si of the stock’s price 
 * on a given day i is defined as the maximum number of consecutive days 
 * just before the given day, for which the price of the stock on the 
 * current day is less than its price on the given day. 

Examples:
-----------
Input: N = 7, price[] = [100 80 60 70 60 75 85]
Output: 1 1 1 2 1 4 6
Explanation: Traversing the given input span for 100 will be 1, 80 is smaller
than 100 so the span is 1, 60 is smaller than 80 so the span is 1, 70 is 
greater than 60 so the span is 2 and so on. Hence the output will be 
1 1 1 2 1 4 6.

Input: N = 6, price[] = [10 4 5 90 120 80]
Output:1 1 2 4 5 1
Explanation: Traversing the given input span for 10 will be 1, 4 is smaller 
than 10 so the span will be 1, 5 is greater than 4 so the span will be 2 
and so on. Hence, the output will be 1 1 2 4 5 1.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        for(Integer i : calcSpan(arr)){
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> calcSpan(int[] arr) {
        
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int n =  arr.length;
        for(int i=0; i<n; i++) {
            if(st.empty()) {
                result.add(i-(-1));
            }
            else if(!st.empty() && arr[i]<arr[st.peek()]) {
                result.add(i-st.peek());
            }
            else {
                while(!st.empty() && arr[i]>arr[st.peek()]) {
                    st.pop();
                    if(st.empty()) {
                        result.add(i-(-1));
                    }
                    else if(arr[i]<arr[st.peek()]) {
                        result.add(i-st.peek());
                    }
                }
            }
            st.push(i);
        }
        return result;
    }
}

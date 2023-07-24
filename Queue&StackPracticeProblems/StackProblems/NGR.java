/*
 * Next Greater Element (NGE) for every element in given Array / next Greater to right.
 * -------------------------------------------------------------------------------------
 * 
 * Input: arr[] = [ 4 , 5 , 2 , 25 ]
 * Output:     4      –>   5
               5      –>   25
               2      –>   25
              25     –>   -1
    Explanation: except 25 every element has an element greater than them present on the right side
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class NGR {

    private static LinkedList<Integer> nextGreater(int[] arr) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=n-1; i>=0; i--) {
            if(st.isEmpty()) {
                result.addFirst(-1);
            }
            else if(!st.isEmpty() && arr[i] < st.peek()){
                result.addFirst(st.peek());
            }
            else{
                while(!st.isEmpty() && arr[i] > st.peek()) {
                    st.pop();
                    if(st.isEmpty()){
                        result.addFirst(-1);
                    }
                    else if(arr[i] < st.peek()){
                        result.addFirst(st.peek());
                    }
                }
            }
            st.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        for(Integer i : nextGreater(arr)){
            System.out.print(i + " ");
        }
         
    }

    
}
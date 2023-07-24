/*
 * Next Smaller to Left :
 * input : [2, 1, 4, 7]
 * output: [-1, -1, 1, 4]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class NSL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        for(Integer i : nextSmaller(arr)){
            System.out.print(i + " ");
        }
    }

    private static LinkedList<Integer> nextSmaller(int[] arr) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(st.empty()){
                result.add(-1);
            }
            else if(!st.empty() && arr[i]>st.peek()) {
                result.add(st.peek());
            }
            else {
                while(!st.empty() && arr[i]<st.peek()) {
                    st.pop();
                    if(st.empty()){
                        result.add(-1);
                    }
                    else {
                        result.add(st.peek());
                    }
                }
            }
            st.push(arr[i]);
        }
        
        return result;
    }
}

/*
next Greater to left for every element in given Array .

input : [2, 4, 7 ,3]
output : [-1, -1, -1, 7]
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class NGL {
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

    private static LinkedList<Integer> nextGreater(int[] arr) {
        LinkedList <Integer> output = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(st.isEmpty()){
                output.add(-1);
            }
            else if(!st.isEmpty() && arr[i]<st.peek()) {
                output.add(st.peek());
            }
            else {
                while(!st.isEmpty() && arr[i]>st.peek()) {
                    st.pop();
                    if(st.isEmpty()){
                        output.add(-1);
                    }
                    else{
                        output.add(st.peek());
                    }
                }
            }
            st.push(arr[i]);
        }
        return output;
    }
}

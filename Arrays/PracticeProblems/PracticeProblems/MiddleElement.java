
/*
 * Write a function called middle that takes an array and returns a 
 * new array that contains all but the first and last elements.
 * myArray = [1, 2, 3, 4]
 * middle(myArray)  # [2,3]
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiddleElement {
    
    public static int[] middle(int[] array) {
        int mid = array.length / 2;
        if(array.length%2 == 0){
            // int arr[] = new int [2];
            // arr[0]= array[mid-1];
            // arr[1] = array[mid];
            return new int[] {array[mid-1],array[mid]};
        }
        else{
            // int arr[] = new int[1];
            // arr[0] = array[mid];
            return new int[] {array[mid]};
        }
        
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String[] strInput = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strInput[i]);
        }
        for(int ans : middle(arr)){
            System.out.print(ans+ " ");
        } 
    }


}

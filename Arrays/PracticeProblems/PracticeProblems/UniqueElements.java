import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;

public class UniqueElements {
    public static int[] removeDuplicates(int[] arr) {
        // O(n^2) solution
        // int resArray[] = new int [arr.length];
        // int index = 0;
        // for(int i=0; i<arr.length; i++){
        //     int count = 0;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //             break;
        //         }
        //     }
        //     if(count==0){
        //         resArray[index] = arr[i];
        //         index++;
        //     }
        // }
        // return Arrays.copyOf(resArray, index);

        // O(n) solution
        Set<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        int resultArray[] = new int [set.size()];
        int index=0;
        for(Integer i : set){
            resultArray[index++]=i;
        }
        return resultArray;
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
        for(int ans : removeDuplicates(arr)){
            System.out.print(ans+ " ");
        } 
      }
}

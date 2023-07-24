/*
 * Permutation
Your are given two integer arrays. Write a program to check if they are permutation of each other.

Example

int[] array1 = {1,2,3,4,5};
int[] array2 = {5,1,2,3,4};
permutation(array1, array2)
Output

true
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutation {
    public static boolean permutation(int[] array1, int[] array2){
        int sum1=0,sum2=0,mul1=1,mul2=1;
        if(array1.length!=array2.length)
            return false;
        for(int i : array1){
            sum1+=i;
            mul1*=i;
        }
        for(int j : array2){
            sum2+=j;
            mul2*=j;
        }
        if(sum1==sum2 && mul1==mul2)
            return true;
        else
            return false;
        
    }
   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,m;
        n=Integer.parseInt(br.readLine());
        m=Integer.parseInt(br.readLine());
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        String[] strInput1 = br.readLine().split(" ");
        String[] strInput2 = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr1[i]=Integer.parseInt(strInput1[i]);
        }
        for(int i=0;i<m;i++) {
            arr2[i]=Integer.parseInt(strInput2[i]);
        }
        System.out.println(permutation(arr1,arr2));
    }
}

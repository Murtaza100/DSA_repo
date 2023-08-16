import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {
    public static void main(String[] args) {
        Map<Integer,Integer> memo = new HashMap<>();
        System.out.println("Top Down With Memorization : " + calcFibWithMemo(6, memo));
        System.out.println("Bottom Up With Tabulation : " + calcFibWithTabulation(6));
    }

    // Top Down with memorization - using hashmap for memorization
    public static int calcFibWithMemo(int n, Map<Integer,Integer> memo) {
        if(n==1)
            return 0;
        if(n==2) 
            return 1;
        if(!memo.containsKey(n))
            memo.put(n, calcFibWithMemo(n-1, memo)+calcFibWithMemo(n-2, memo));
        return memo.get(n);
    }

    // Bottom up approach using Tabulation
    public static int calcFibWithTabulation(int n) {
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        for(int i=2; i<n; i++) {
            int n1 = fib.get(i-1);
            int n2 = fib.get(i-2);
            fib.add(n1+n2);
        }
        return fib.get(n-1);
    }
}
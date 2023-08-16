/*
 * Number Factor
 * --------------
Given N, find the number of ways to express N as a 
sum of 1, 3 and 4 
 */

public class NumberFactor {

    // Top Down approach
    private int calcWaysTopDown(int[] dp, int n) {
        if(n==0 || n==1 || n==2)
            return 1;
        if(n==3)
            return 2;
        if(dp[n] == 0) {
            int subProb1 = calcWaysTopDown(dp, n-1);
            int subProb2 = calcWaysTopDown(dp, n-3);
            int subProb3 = calcWaysTopDown(dp, n-4);
            dp[n] = subProb1+subProb2+subProb3;
        }
        return dp[n];
    }
    public int calcWaysTopDown(int n) {
        int[] dp = new int[n+1];
        return calcWaysTopDown(dp, n);
    }

    // Bottom Up approach
    public int calcWaysBottomUp(int n) {
        int[] dp = new int[n+1];
        dp[0] = dp[1] = dp[2] = 1;
        dp[3] = 2;
        for(int i=4; i<=n; i++) {
            dp[i] = dp[i-1]+dp[i-3]+dp[i-4];
        } 
        return dp[n];
    }
    
}

/*
 * House Robber 
 * -------------
 * - Given N number of houses along the street with some amount of money
 * - Adjacent houses cannot be stolen
 * - Find the maximum amount that can be stolen using Dynamic Programing
 */

public class HouseRobber {
    // Top Down Approach
    //-------------------
	public int maxMoneyTopDown(int[] HouseNetWorth) {
	   int[] dp = new int[HouseNetWorth.length];
	   return calcmaxMoneyTopDown(HouseNetWorth, dp, 0);
	}
	
	private int calcmaxMoneyTopDown(int[] houseNetWorth, int[] dp, int house) {
	    if(house >=houseNetWorth.length)
	        return 0;
	    else if(dp[house] == 0) {
	        int lootCurrentHouse = houseNetWorth[house] + calcmaxMoneyTopDown(houseNetWorth, dp, house+2);
	        int skipCurrentHouse = calcmaxMoneyTopDown(houseNetWorth, dp, house+1);
	        dp[house] = Math.max(lootCurrentHouse, skipCurrentHouse);
	    }
	    return dp[house];
	}

    // Bottom Up Approach
    //--------------------
    public int maxMoneyBottomUp(int[] houseNetWorth) {
        int[] dp = new int[houseNetWorth.length + 2];
        int n = dp.length;
        //dp[n-1] = dp[n-2] = 0; in java indexes initialised are 0 by default, so no need
        for(int i = n-3; i >= 0; i--) {
            int lootCurrentHouse = dp[i+2];
            int skipCurrentHouse = dp[i+1];
            dp[i] = Math.max(houseNetWorth[i]+lootCurrentHouse,skipCurrentHouse);
        }
        return dp[0];
    }
}
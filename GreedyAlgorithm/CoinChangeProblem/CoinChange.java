import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {

    // TC-O(NlogN) due to sorting, SC-O(N) arraylist created
    public List<Integer> findCoin(int[] coins, int amount) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(coins);
        for(int i=coins.length-1; i>=0; i--) {
            while(amount >= coins[i]) {
                ans.add(coins[i]);
                amount = amount - coins[i];
            }
        }
        return ans;
    }

    //TC-O(NLogN), SC-O(1)
    // Note: if no sorting needed then O(amount) or O(N)-TC
    public void findCoinDenominations(int[] coins, int N) {
        // here N is amount
        Arrays.sort(coins);
        int index = coins.length-1;
        while(true) {
            int coinUsed = coins[index];
            index--;
            int amountCreated = (N/coinUsed)*coinUsed;
            if(amountCreated > 0) {
                System.out.println("coins of denomination : " + coinUsed
                    + " taken " + (N/coinUsed) + " times");
                N = N-amountCreated;
            }
            
            if(N==0)
                break;
        }
    }
}

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int amount = 2035;
        System.out.println("coin denominations : " + Arrays.toString(coins));
        System.out.println("amount : " + amount);
        List<Integer> coinUsed = coinChange.findCoin(coins, amount);
        for(Integer i : coinUsed) {
            System.out.print(i + " ");
        }
        System.out.println();
        coinChange.findCoinDenominations(coins, amount);
    }
}
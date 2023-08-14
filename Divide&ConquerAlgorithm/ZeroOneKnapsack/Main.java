public class Main {
    public static void main(String[] args) {
        ZeroOneKnapsack knapsack = new ZeroOneKnapsack();
        int[] profits = {31,26,17,72};
        int[] weights = {3,1,2,5};
        int capacity = 7;
        int maxProfit = knapsack.calcKnapsack(profits, weights, capacity);
        System.out.println(maxProfit);
    }
}
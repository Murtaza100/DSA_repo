public class ZeroOneKnapsack {
    private int calcKnapsack(int[] profits, int[] weights, int capacity, int curIndex) {
        if((capacity<=0) || (curIndex<0) || (curIndex>=profits.length))
            return 0;
        if(weights[curIndex] <= capacity) {
            int profit_1 = profits[curIndex] + calcKnapsack(profits, 
                weights, capacity-weights[curIndex], curIndex+1); 
            int profit_2 = calcKnapsack(profits, weights, capacity, curIndex+1);
            return Math.max(profit_1, profit_2);
        }
        return 0;
    }

    public int calcKnapsack(int[] profits, int[] weights, int capacity) {
        return calcKnapsack(profits, weights, capacity, 0);
    }
}

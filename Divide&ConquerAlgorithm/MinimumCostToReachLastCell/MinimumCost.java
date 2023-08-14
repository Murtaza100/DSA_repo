public class MinimumCost {

    private int calcMinCost(int[][] cost, int row, int col) {
        if(row == -1 || col == -1)
            return Integer.MAX_VALUE;
        if(row==0 && col ==0)
            return cost[row][col];
        else {
            int op1 = calcMinCost(cost, row-1, col); // go up
            int op2 = calcMinCost(cost, row, col-1); // go left
            int minCost = Math.min(op1, op2);
            return cost[row][col] + minCost;
        }
    }

    public int calcMinCost(int[][] cost) {
        return calcMinCost(cost, cost.length-1, cost[0].length-1);
    }
}

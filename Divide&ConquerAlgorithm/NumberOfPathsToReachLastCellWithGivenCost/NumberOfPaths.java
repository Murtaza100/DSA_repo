public class NumberOfPaths {

    private int totalNoOfPathsPossible(int[][] costArray, int row, int col, int cost) {
        if(cost < 0) 
            return 0;
        if(row == 0 && col ==0)
            return (costArray[row][col] - cost == 0) ? 1 : 0;
        if(row == 0) 
            return totalNoOfPathsPossible(costArray, 0, col-1, cost-costArray[row][col]);
        if(col == 0)
            return totalNoOfPathsPossible(costArray, row-1, 0, cost- costArray[row][col]);
        else {
            int possiblePathViaPrevCol = totalNoOfPathsPossible(costArray, row, col-1, 
                cost- costArray[row][col]);
            int possiblePathViaPrevRow = totalNoOfPathsPossible(costArray, row-1, 
                col, cost- costArray[row][col]);
            return possiblePathViaPrevCol+possiblePathViaPrevRow;
        }
    }

    public int findTotalPathsPossible(int[][] costArray, int cost) {
        return totalNoOfPathsPossible(costArray, costArray.length-1, costArray[0].length-1, cost);
    }
}

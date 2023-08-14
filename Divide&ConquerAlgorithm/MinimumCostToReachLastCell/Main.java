public class Main {
    public static void main(String[] args) {
        int[][] array = {
            {4, 7, 8, 6, 4},
            {6, 7, 3, 9, 2},
            {3, 8, 1, 2, 4},
            {7, 1, 7, 3, 7},
            {2, 9, 8, 9, 3}
        };

        MinimumCost minimumCost = new MinimumCost();
        int minCost = minimumCost.calcMinCost(array);
        System.out.println(minCost);
    }
}
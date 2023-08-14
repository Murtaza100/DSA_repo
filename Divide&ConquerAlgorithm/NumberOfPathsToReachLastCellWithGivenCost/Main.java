public class Main {
    public static void main(String[] args) {
        NumberOfPaths numberOfPaths = new NumberOfPaths();
        int[][] costarray = {
            {4, 7, 1, 6},
            {5, 7, 3, 9},
            {3, 2, 1, 2},
            {7, 1, 6, 3}
        };
        int cost = 25;
        int totalPaths = numberOfPaths.findTotalPathsPossible(costarray, cost);
        System.out.println(totalPaths);
    }
}
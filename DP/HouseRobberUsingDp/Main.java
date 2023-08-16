public class Main {
    public static void main(String[] args) {
        int[] houseNetWorth = {6, 7, 1, 30, 8, 2, 4}; // op-41 | {} // op-0;
        HouseRobber hr = new HouseRobber();
        int maxNetRobbedTopDown = hr.maxMoneyTopDown(houseNetWorth);
        System.out.println("using top down approach : "+maxNetRobbedTopDown);
        int maxNetRobbedBottomUp = hr.maxMoneyBottomUp(houseNetWorth);
        System.out.println("using bottom up approach : "+maxNetRobbedBottomUp);
    }
}
public class Main {
    public static void main(String[] args) {
        int[] houseNetWorth = {6, 7, 1, 30, 8, 2, 4};
        HouseRobber hr = new HouseRobber();
        int maxNetRobbed = hr.calcMaxRob(houseNetWorth);
        System.out.println(maxNetRobbed);
    }
}
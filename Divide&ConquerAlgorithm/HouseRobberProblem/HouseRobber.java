public class HouseRobber {
    private int calcMaxRob(int[] houseNetWorth, int curHouse) {
        if(curHouse >= houseNetWorth.length)
            return 0;
        int stealCurrenttHouse = houseNetWorth[curHouse] + calcMaxRob(houseNetWorth, curHouse+2);
        int skipCurrentHouse = calcMaxRob(houseNetWorth, curHouse+1);

        return Math.max(stealCurrenttHouse, skipCurrentHouse);
    }

    public int calcMaxRob(int[] houseNetWorth) {
        return calcMaxRob(houseNetWorth, 0);
    }
}

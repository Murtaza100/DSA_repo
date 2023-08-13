import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Activity> activityList = new ArrayList<>();
        activityList.add(new Activity("A", 0, 6));
        activityList.add(new Activity("B", 3, 4));
        activityList.add(new Activity("C", 1, 2));
        activityList.add(new Activity("D", 5, 8));
        activityList.add(new Activity("E", 5, 7));
        activityList.add(new Activity("F", 8, 9));

        ActivitySelection activitySelection = new ActivitySelection();
        activitySelection.activitySelection(activityList);
    }
}
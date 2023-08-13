// TC - O(NlogN) - due to sorting, SC - O(1) - no extra space required.

import java.util.ArrayList;
import java.util.Collections;

public class ActivitySelection {
    public void activitySelection (ArrayList<Activity> activityList) {

        Collections.sort(activityList, (a1,a2) -> {
            return a1.getEndTime()-a2.getEndTime();
        });

        Activity firstActivity = activityList.get(0);
        System.out.println("Activities : \n"+firstActivity);
        for(int i=1; i<activityList.size(); i++) {
            if(firstActivity.getEndTime() <= activityList.get(i).getStartTime()) {
                Activity activity = activityList.get(i);
                System.out.println(activity);
                firstActivity = activity;
            }
        }

    }
}



public class Activity {
    String name;
    int startTime;
    int endTime;
    public Activity(String name, int startTime, int endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public String getName() {
        return name;
    }
    public int getStartTime() {
        return startTime;
    }
    public int getEndTime() {
        return endTime;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    @Override
    public String toString() {
        return "Activity [name=" + name + ", startTime=" + startTime + ", endTime=" + endTime + "]";
    }

    
}

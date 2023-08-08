public class Pair implements Comparable<Pair> {
    int value;
    int  gap;

    public Pair(int value, int gap) {
        this.value = value;
        this.gap = gap;
    }

    @Override
    public int compareTo(Pair o) {
        if(this.gap == o.gap)
            return this.value - o.value;
        else
            return this.gap - o.gap;
    }

}

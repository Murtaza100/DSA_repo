public class KnapSackItem {
    private int index;
    private int value;
    private int weight;
    private double ratio; // ratio or density whatever u want to name it
    public KnapSackItem(int index, int value, int weight) {
        this.index = index;
        this.value = value;
        this.weight = weight;
        this.ratio = (value*1.0)/weight;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setRatio(double ratio) {
        this.ratio = ratio;
    }
    public int getIndex() {
        return index;
    }
    public int getValue() {
        return value;
    }
    public int getWeight() {
        return weight;
    }
    public double getRatio() {
        return ratio;
    }
    @Override
    public String toString() {
        return "KnapSackItem [index=" + index + ", value=" + value + ", weight=" + weight + ", ratio=" + ratio + "]";
    }
    
    
}

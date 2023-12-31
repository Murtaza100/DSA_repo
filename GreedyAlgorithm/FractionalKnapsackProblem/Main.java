import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<KnapSackItem> items = new ArrayList<>();
        int[] value = {100, 120, 60};
        int[] weight = {20, 30, 10};
        int capacity = 50;
        for( int i=0; i<value.length; i++) {
            items.add(new KnapSackItem(i+1, value[i], weight[i]));
        }
        KnapSack.calcKnapSack(items, capacity);
    }
}
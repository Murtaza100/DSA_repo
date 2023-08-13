import java.util.ArrayList;
import java.util.Collections;

public class KnapSack {
    // TC-O(nlogn) - due to sorting, SC-O(1)
    static void calcKnapSack(ArrayList<KnapSackItem> items, int capacity) {
        Collections.sort(items, (item1, item2) -> {
            if(item2.getRatio() > item1.getRatio())
                return 1;
            else if(item2.getRatio() < item1.getRatio())
                return -1;
            else
                return 0;
        });

        int usedCapacity = 0;
        int totalValue = 0;
        for( KnapSackItem item : items) {
            if(usedCapacity+item.getWeight() <= capacity) {
                System.out.println("Taken : " + item);
                usedCapacity += item.getWeight();
                totalValue += item.getValue();
            }
            else {
                int usedWeight = capacity-usedCapacity;
                double value = usedWeight*item.getRatio();
                System.out.println("Taken : KnapSackItem [index=" + item.getIndex() + 
                    ", used value=" + value + ",used weight=" + usedWeight + ", ratio=" + 
                        item.getRatio() +"]");
                usedCapacity += usedWeight;
                totalValue += value;
            }
            if(capacity == usedCapacity) 
                break;
        }
        System.out.println("total value obtained : " + totalValue);
    }
    
}

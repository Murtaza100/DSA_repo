import java.util.ArrayList;

public class GraphNode {
    String value;
    int index;
    boolean isVisited = false;

    ArrayList<GraphNode> neighbors = new ArrayList<>();

    public GraphNode(String value, int index) {
        this.value = value;
        this.index = index;
    }
}

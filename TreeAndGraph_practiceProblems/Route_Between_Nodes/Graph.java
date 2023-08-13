import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<>();

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addDirectedEdge(int i, int j) {
        GraphNode firstNode = nodeList.get(i);
        GraphNode secNode = nodeList.get(j);
        firstNode.neighbors.add(secNode);
    }

    public boolean findRoute(GraphNode start, GraphNode end) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.offer(start);
        while(!queue.isEmpty()) {
            GraphNode curNode = queue.poll();
            curNode.isVisited = true;
            if(curNode != null) {
                for(GraphNode node : curNode.neighbors) {
                    if(!node.isVisited) {
                        if(node == end) {
                            return true;
                        }
                        queue.offer(node);
                        node.isVisited=true;
                    }
                }
            }
        }
        return false;
    }
}

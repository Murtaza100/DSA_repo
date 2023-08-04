import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> vertices = new ArrayList<>();
        vertices.add(new GraphNode("A", 0));
        vertices.add(new GraphNode("B", 1));
        vertices.add(new GraphNode("C", 2));
        vertices.add(new GraphNode("D", 3));
        vertices.add(new GraphNode("E", 4));
        vertices.add(new GraphNode("F", 5));
        vertices.add(new GraphNode("G", 6));
        vertices.add(new GraphNode("H", 7));

        Graph graph = new Graph(vertices);

        graph.addDirectedEdge(0, 2);
        graph.addDirectedEdge(2, 4);
        graph.addDirectedEdge(4, 7);
        graph.addDirectedEdge(4, 5);
        graph.addDirectedEdge(5, 6);
        graph.addDirectedEdge(1, 2);
        graph.addDirectedEdge(1, 3);
        graph.addDirectedEdge(3, 5);
        System.out.println(graph.toString());
        graph.topologicalSort();
    }
}
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
        vertices.add(new GraphNode("I", 8));
        vertices.add(new GraphNode("J", 9));

        Graph graph = new Graph(vertices);

        graph.addDirectedEdge(0, 2);
        graph.addDirectedEdge(0, 3);
        graph.addDirectedEdge(0, 1);
        graph.addDirectedEdge(1, 9);
        graph.addDirectedEdge(2, 6);
        graph.addDirectedEdge(6, 3);
        graph.addDirectedEdge(6, 7);
        graph.addDirectedEdge(7, 8);
        graph.addDirectedEdge(5, 8);
        graph.addDirectedEdge(4, 5);
        graph.addDirectedEdge(4, 0);

        // System.out.println(graph.findRoute(vertices.get(0), vertices.get(4))); //A-E -> false
        System.out.println(graph.findRoute(vertices.get(6), vertices.get(3))); //G-D -> true
    }
}
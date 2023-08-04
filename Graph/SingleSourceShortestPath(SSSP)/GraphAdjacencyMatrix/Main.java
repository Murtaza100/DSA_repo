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

        Graph graph = new Graph(vertices);

        graph.addUndirectedEdge(0, 1); // A-B
        graph.addUndirectedEdge(0, 2); // A-C
        graph.addUndirectedEdge(1, 3); // B-D
        graph.addUndirectedEdge(1, 6); // B-G
        graph.addUndirectedEdge(2, 3); // C-D
        graph.addUndirectedEdge(2, 4); // C-E
        graph.addUndirectedEdge(3, 5); // D-F
        graph.addUndirectedEdge(4, 5); // E-F
        graph.addUndirectedEdge(5, 6); // F-G

        graph.BFSForSSSPP(vertices.get(0));
    }
}
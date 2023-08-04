import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> vertices = new ArrayList<GraphNode>();
        
        vertices.add(new GraphNode("A",0));
        vertices.add(new GraphNode("B",1));
        vertices.add(new GraphNode("C",2));
        vertices.add(new GraphNode("D",3));
        vertices.add(new GraphNode("E",4));

        Graph graph = new Graph(vertices);

        graph.addUndirectedEdge(0,1);
        graph.addUndirectedEdge(0,2);
        graph.addUndirectedEdge(0,3);
        graph.addUndirectedEdge(1,4);
        graph.addUndirectedEdge(2,3);
        graph.addUndirectedEdge(3,4);

        System.out.print(graph.toString());

        graph.bfs();
        // System.out.println();
        // graph.dfs();
    }
}

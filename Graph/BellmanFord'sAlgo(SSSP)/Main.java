import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> vertices =  new ArrayList<>();
        vertices.add(new WeightedNode("A", 0));
        vertices.add(new WeightedNode("B", 1));
        vertices.add(new WeightedNode("C", 2));
        vertices.add(new WeightedNode("D", 3));
        vertices.add(new WeightedNode("E", 4));
        vertices.add(new WeightedNode("F", 5));
        vertices.add(new WeightedNode("G", 6));

        WeightedGraph graph = new WeightedGraph(vertices);

        graph.addWeightedEdge(0, 1, 2);
        graph.addWeightedEdge(0, 2, 5);
        graph.addWeightedEdge(1, 2, 5);
        graph.addWeightedEdge(1, 3, 1);
        graph.addWeightedEdge(1, 4, 3);
        graph.addWeightedEdge(2, 5, 8);
        graph.addWeightedEdge(3, 4, 4);
        graph.addWeightedEdge(4, 6, 9);
        graph.addWeightedEdge(5, 6, 7);

        System.out.println("printing BellmanFord from source " + vertices.get(0).name);

        graph.bellmanFord(vertices.get(0));



    }
}
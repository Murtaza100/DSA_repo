import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> vertices =  new ArrayList<>();
        vertices.add(new WeightedNode("A", 0));
        vertices.add(new WeightedNode("B", 1));
        vertices.add(new WeightedNode("C", 2));
        vertices.add(new WeightedNode("D", 3));

        FloydWarshall graph = new FloydWarshall(vertices);

        graph.addWeightedEdge(0, 3, 1);
        graph.addWeightedEdge(0, 1, 8);
        graph.addWeightedEdge(1, 2, 1);
        graph.addWeightedEdge(2, 0, 4);
        graph.addWeightedEdge(3, 1, 2);
        graph.addWeightedEdge(3, 2, 9);
    
        System.out.println("printing FloydWarshall from source " + vertices.get(0).name);

        graph.floydWarshall();



    }
}
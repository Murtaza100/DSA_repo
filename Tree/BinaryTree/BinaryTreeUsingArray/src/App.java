public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree binaryTree = new BinaryTree(9);
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");
        // binaryTree.preOrder(1);
        // System.out.println();
        // binaryTree.inOrder(1);
        // System.out.println();
        // binaryTree.postOrder(1);
        // System.out.println();
        binaryTree.levelOrder();
        System.out.println();
        // binaryTree.search("N9");
        // System.out.println();
        binaryTree.deleteNode("N2");
        binaryTree.levelOrder();
        System.out.println();
        binaryTree.deleteBT();
    }
}

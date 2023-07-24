public class App {
    public static void main(String[] args) throws Exception {
        BinaryTreeUsingLL binaryTree = new BinaryTreeUsingLL();
        binaryTree.insertNode("Drinks");
        binaryTree.insertNode("Hot");
        binaryTree.insertNode("Cold");
        binaryTree.insertNode("Tea");
        binaryTree.insertNode("Coffee");
        binaryTree.insertNode("Alcoholic");
        binaryTree.insertNode("Non Alcoholic");

        binaryTree.levelOrder();
        System.out.println();
        // binaryTree.preOrder(binaryTree.root);
        // System.out.println();
        // binaryTree.inOrder(binaryTree.root);
        // System.out.println();
        // binaryTree.postOrder(binaryTree.root);
        // System.out.println();
        // binaryTree.searchNode("Tea");
        binaryTree.deleteNode("Coffee");
        binaryTree.levelOrder();
        binaryTree.deleteBinaryTree();
        binaryTree.levelOrder();
    }
}

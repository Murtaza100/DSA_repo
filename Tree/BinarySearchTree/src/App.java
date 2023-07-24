public class App {
    public static void main(String[] args) throws Exception {
        BST newBST = new BST();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        // newBST.preOrder(newBST.root);
        // System.out.println();
        // newBST.inOrder(newBST.root);
        // System.out.println();
        // newBST.postOrder(newBST.root);
        // System.out.println();
        newBST.levelOrder();
        System.out.println();
        // newBST.search(newBST.root, 10);
        newBST.deleteNode(newBST.root, 100);
        newBST.levelOrder();
        newBST.deleteBST();
    }
}

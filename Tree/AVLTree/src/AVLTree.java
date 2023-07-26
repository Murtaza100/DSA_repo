import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    BinaryNode root;
    public AVLTree() {
        this.root = null;
    }

    // PreOrder
    public void preOrder(BinaryNode node) {
        if(node == null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    } 

    // InOrder
    public void inOrder(BinaryNode node) {
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }

    // PostOrder
    public void postOrder(BinaryNode node) {
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
    }

    // LevelOrder
    public void LevelOrder() {
        Queue<BinaryNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            BinaryNode curNode = q.remove();
            System.out.println(curNode.value + " ");
            if(curNode.left != null)
                q.add(curNode.left);
            if(curNode.right != null)
                q.add(curNode.right);
        }
    }

    // Search
    public BinaryNode searchNode(BinaryNode node, int value) {
        if(node == null){
            System.out.println("Node with value "+value+" is not found in AVL tree");
            return null;
        }
        else if(value == node.value) {
            System.out.println("Node with value "+value+" is found is AVL tree");
            return node;
        }
        else if(value < node.value) {
            return searchNode(node.left, value);
        }
        else {
            return searchNode(node.right, value);
        }
    }

}

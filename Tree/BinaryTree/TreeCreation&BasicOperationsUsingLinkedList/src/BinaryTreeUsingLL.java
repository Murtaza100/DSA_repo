import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeUsingLL {

    // Creation of binary tree with root node
    BinaryNode root;
    public BinaryTreeUsingLL() {
        this.root = null;
    }

    // PreOrder traversal
    public void preOrder(BinaryNode node) {
        if(node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Inorder traversal
    public void inOrder(BinaryNode node) {
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // PostOrder traversal
    public void postOrder(BinaryNode node) {
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // LevelOrder traversal
    public void levelOrder() {
        if(root == null){
            System.out.println("BT is not present or no element present in binary tree");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode currNode = queue.remove();
            System.out.print(currNode.value + " ");
            if(currNode.left!=null) {
                queue.add(currNode.left);
            }
            if(currNode.right!=null) {
                queue.add(currNode.right);
            }
        }
    }

    // Searching a node
    public void searchNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode currNode = queue.remove();
            if(currNode.value == value) {
                System.out.println("Value "+ value + " is present in tree");
                return;
            } 
            else {
                if(currNode.left != null)
                    queue.add(currNode.left);
                if(currNode.right != null)
                    queue.add(currNode.right);
            }
        }
        System.out.println("Value "+value+" is not present in tree");
    }

    // inserting element
    public void insertNode(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if(root == null){
            root = newNode;
            System.out.println("ellement inserted at root node");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode currNode = queue.remove();
            if(currNode.left == null) {
                currNode.left = newNode;
                System.out.println("inserted successfully");
                return;
            }
            else if(currNode.right == null) {
                currNode.right = newNode;
                System.out.println("inserted successfully");
                return;
            }
            else {
                queue.add(currNode.left);
                queue.add(currNode.right);
            }   
        }
    }

/*
Delete a node
--------------
 * steps:
 * 1. find the node (use level order traversal)
 * 2. find deepest node (last node while doing level order traversal)
 * 3. set deepest node's value to current node
 * 4. delete deepest node
 */

    // delete a node
    public void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode currNode = queue.remove();
            if(currNode.value == value) {
                currNode.value = deleteAndGetDeepestNode().value;
                System.out.println("Value "+value+" is deleted successfully");
                return;
            }
            else {
                if(currNode.left != null)
                    queue.add(currNode.left);
                if(currNode.right != null)
                    queue.add(currNode.right);
            }
        }
        System.out.println("No value found to be deleted");
    }

    // get and delete deepest node in same method
    public BinaryNode deleteAndGetDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode resultNode = null;
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
          previousNode = presentNode;
          presentNode = queue.remove();
          if (presentNode.left == null) {
            resultNode = previousNode.right;
            previousNode.right = null;
            return resultNode;
          } else if (presentNode.right == null) {
            resultNode = presentNode.left;
            presentNode.left = null;
            return resultNode;
          }
          queue.add(presentNode.left);
          queue.add(presentNode.right);
    
        }
        return resultNode;
      }

      // delete whole binary tree
      public void deleteBinaryTree() {
        root = null;
        System.out.println("Binary tree deleted successfully");
      }

      /* 
       * get and delete deepest node in different methods
       * // Delete Deepest node
        public void deleteDeepestNode() {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            BinaryNode previousNode, presentNode = null;
            while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);

            }
        }

        // Delete Given node
        void deleteNode(String value) {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node is deleted!");
                return;
            } else {
                if (presentNode.left != null) queue.add(presentNode.left);
                if (presentNode.right != null) queue.add(presentNode.right);
            }
            }
            System.out.println("The node does not exist in this BT");
        }
       * 
       */
      
    
}

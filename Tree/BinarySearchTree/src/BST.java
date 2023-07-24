import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class BST {
    BinaryNode root;
    public BST() {
        this.root = null;
        System.out.println("successfully created blank binary search tree");
    }

    // insert into BST
    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        //System.out.println("The value successfully inserted");
        return newNode;
        } else if (value <= currentNode.value) {
        currentNode.left = insert(currentNode.left, value);
        return currentNode;
        } else {
        currentNode.right = insert(currentNode.right, value);
        return currentNode;
        }
    }

    void insert(int value) {
        root = insert(root, value);
    }

    // PreOrder traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
          return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // InOrder traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
          return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // PostOrder traversal
    public void postOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+ " ");
    }

    // LevelOrder Traversal
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode curNode = queue.remove();
            System.out.print(curNode.value +  " ");
            if(curNode.left != null) {
                queue.add(curNode.left);
            }
            if(curNode.right != null) {
                queue.add(curNode.right);
            }
        }
    }

    // Search
    public BinaryNode search(BinaryNode node, int value) {
        if(node == null) {
            System.out.println(value+" is not present in binary search tree");
            return null;
        }
        else if(node.value == value){
            System.out.println(value+" is present in binary search tree");
            return node;
        }
        else if(value < node.value) {
            return search(node.left, value);
        }
        else {
            return search(node.right, value);
        }
    }

    /*
     * Delete a node from BST
     * -----------------------
     * case 1. delete leaf node
     * case 2. delete node with one child
     * case 3. delete node with two children => need to find successor,
     * successor will be the smallest/ minimum node in right side.
     * Replace successor node value with node to be deleted.
     */

    // minimum node
    public BinaryNode minimumNode(BinaryNode node) {
        if(node.left == null) {
            return node;
        }
        return minimumNode(node.left);
    }

//     // Delete node
//   public BinaryNode deleteNode(BinaryNode root, int value) {
//     if (root == null) {
//       System.out.println("Value not found in BST");
//       return null;
//     }
//     if (value < root.value) {
//       root.left = deleteNode(root.left, value);
//     } else if (value > root.value) {
//       root.right = deleteNode(root.right, value);
//     } else {
//       if (root.left != null && root.right != null) {
//         BinaryNode temp = root;
//         BinaryNode minNodeForRight = minimumNode(temp.right);
//         root.value = minNodeForRight.value;
//         root.right = deleteNode(root.right, minNodeForRight.value);
//       } else if (root.left != null) {
//         root = root.left;
//       } else if (root.right != null) {
//         root = root.right;
//       } else {
//         root = null;
//       }
//     }

//     return root;

//   }

    // delete given node
    public BinaryNode deleteNode(BinaryNode node, int value) {
        if(node == null) {
            System.out.println(value+" is not present, hence can't delete");
            return null;
        }
        if(value < node.value)
            node.left = deleteNode(node.left, value);
        else if(value > node.value)
            node.right = deleteNode(node.right, value);
        else {
            // case 1 : node with two child
            if(node.left != null && node.right != null) {
                BinaryNode temp = node;
                BinaryNode minToRight = minimumNode(temp.right);
                node.value = minToRight.value;
                node.right = deleteNode(node.right, minToRight.value);
            }
            // case 2 : node with one child
            else if(node.left != null) {
                node = node.left;
            }
            else if(node.right != null) {
                node = node.right;
            }
            // case 3 : leaf node
            else {
                node = null;
            }
        }
        return node;
    }

    // delete whole BST
    public void deleteBST() {
        root = null;
        System.out.println("BST has been deleted successfully");
    }

}

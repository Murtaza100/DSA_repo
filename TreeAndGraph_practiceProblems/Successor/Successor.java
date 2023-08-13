/*
 * Successor
 * ----------
Write an algorithm to find the next node (i.e in-order successor) of given node 
in a binary search tree. You may assume that each node has a link to its parent.

Example
--------
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
TreeNode root = TreeNode.createMinimalBST(array);
TreeNode node = root.find(array[1]);
TreeNode next = Successor.inorderSucc(node);
 
//3
 */


public class Successor {
    public static TreeNode inorderSucc(TreeNode n) { 
		if (n == null) return null;
		
		// Found right children -> return left most node of right subtree
		if (n.parent == null || n.right != null) { 
			return leftMostChild(n.right); 
		} else { 
			TreeNode q = n;
			TreeNode x = q.parent;
			// Go up until we're on left instead of right
			while (x != null && x.left != q) {
				q = x;
				x = x.parent;
			}
			return x;
		}  
	} 
		
	public static TreeNode leftMostChild(TreeNode n) {
		if (n == null) {
			return null;
		}
		while (n.left != null) {
			n = n.left; 
		}
		return n; 
	}
 
}

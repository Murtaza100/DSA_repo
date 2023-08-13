/*
 * Minimal Tree
 * -------------
Given a sorted (increasing order) array with unique integer elements, 
write an algorithm to create a binary search tree with minimal height.

Implement method :
    public static TreeNode createMinimalBST(int[] array) {

	}
 */


public class TreeNode {
	public int data;      
	public TreeNode left;    
	public TreeNode right; 
	public TreeNode parent;
	public int size = 0;

	public TreeNode(int d) {
		data = d;
		size = 1;
	}
	
// 	  public boolean isBST() {
// 		if (left != null) {
// 			if (data < left.data || !left.isBST()) {
// 				return false;
// 			}
// 		}
		
// 		if (right != null) {
// 			if (data >= right.data || !right.isBST()) {
// 				return false;
// 			}
// 		}		
		
// 		return true;
// 	}
	
    // to get height
	// public int height() {
	// 	int leftHeight = left != null ? left.height() : 0;
	// 	int rightHeight = right != null ? right.height() : 0;
	// 	return 1 + Math.max(leftHeight, rightHeight);
	// }
	
    // helper
	private void setLeftChild(TreeNode left) {
		this.left = left;
		if (left != null) {
			left.parent = this;
		}
	}
	
    // helper
	private void setRightChild(TreeNode right) {
		this.right = right;
		if (right != null) {
			right.parent = this;
		}
	}
	
	// helper
	private static TreeNode createMinimalBST(int arr[], int start, int end){
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		n.setLeftChild(createMinimalBST(arr, start, mid - 1));
		n.setRightChild(createMinimalBST(arr, mid + 1, end));
		return n;
	}
	
    // to implement
	public static TreeNode createMinimalBST(int[] array) {
		return createMinimalBST(array, 0, array.length - 1);
	}

} 

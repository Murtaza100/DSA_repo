/*
 * Find Common Ancestor
 * ----------------------
Design an algorithm and write code to find the first common ancestor of 
two nodes in a binary tree. Avoid storing additional nodes in a data structure.
 NOTE: This is not necessarily a binary search tree.

Example:
--------
    int[] array = {5, 3, 6, 1, 9, 11};
    TreeNode root = new TreeNode(20);
    for (int a : array) {
      root.insertInOrder(a);
    }
    TreeNode n1 = root.find(1);
    TreeNode n9 = root.find(9);
    TreeNode ancestor = CommonAncestor.commonAncestor(root, n1, n9);
    System.out.println(ancestor.data);
 
//5
 */


public class CommonAncestor {
	
	public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if ((p == null) || (q == null)) {
			return null;
		}
		
		TreeNode ap = p.parent;
		while (ap != null) {
			TreeNode aq = q.parent;
			while (aq != null) { 
				if (aq == ap) {
					return aq;
				}
				aq = aq.parent;
			}
			ap = ap.parent;
		}
		return null;
	}
	
 
}

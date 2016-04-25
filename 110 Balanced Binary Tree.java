/**
* Given a binary tree, determine if it is height-balanced.
* For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1. 
**/

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int treeDepth(TreeNode node){
		if(node==null)
			return 0;
		int leftDepth = treeDepth(node.left);
		int rightDepth = treeDepth(node.right);
		return Math.max(leftDepth+1, rightDepth+1);
	}
	
	public boolean isBalanced(TreeNode root) {
		if(root==null)
			return true;
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		if(left-right>1||left-right<-1)
			return false;
		return isBalanced(root.left)&&isBalanced(root.right);     
	}
}
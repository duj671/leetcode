/**
* Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
* For example:
* Given the below binary tree and sum = 22,
*               5
*              / \
*             4   8
*            /   / \
*           11  13  4
*          /  \      \
*         7    2      1
* return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
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
    public boolean hasPathSum(TreeNode root, int sum) {
		return Tree(root,sum);
    }
    public boolean Tree(TreeNode node, int result){
		if(node==null)
			return false;
		if(node.left==null&&node.right==null){
			if(result-node.val==0){
				return true;
			}
		}
		return (Tree(node.left,result-node.val)||Tree(node.right,result-node.val));
	}
}
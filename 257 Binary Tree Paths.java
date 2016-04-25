/**
* Given a binary tree, return all root-to-leaf paths.
* For example, given the following binary tree:
*    1
*  /   \
* 2     3
*  \
*   5
* All root-to-leaf paths are:
* ["1->2->5", "1->3"]
**/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<String> treePaths = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root != null){
            findPaths(root,String.valueOf(root.val));
        }
        return treePaths;
    }

    private void findPaths(TreeNode root,String string){
        if(root.left == null && root.right == null){
            treePaths.add(string);
        }
        if(root.left != null){
            findPaths(root.left,string+"->"+root.left.val);
        }
        if(root.right != null){
            findPaths(root.right,string+"->"+root.right.val);
        }
    }
}
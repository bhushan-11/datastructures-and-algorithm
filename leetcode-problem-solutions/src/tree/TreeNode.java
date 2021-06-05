package tree;

public class TreeNode {


 TreeNode left;
 
 TreeNode right;
 int val;
 
 public TreeNode() {
	// TODO Auto-generated constructor stub
}
 
 TreeNode (int val){
	 this.val=val;
 }
 
 TreeNode(int val, TreeNode left,TreeNode right){
	 this.val=val;
	 this.left=left;
	 this.right=right;
 }
}

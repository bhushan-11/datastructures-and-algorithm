package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListAtDepth {
	
	public List<List<Integer>> levelOrder(TreeNode root){
		
		List<List<Integer>> result = new ArrayList<>();
		
		if(root == null) {
			return result;
		}
		
	Queue<TreeNode> queue = new LinkedList<TreeNode>();
	
	queue.add(root);
	
	while(!queue.isEmpty()) {
		
		int size= queue.size();
		
		
		List<Integer> currentlist= new ArrayList<>();
		
		for(int i=0;i<size;i++) {
			
			TreeNode currentNode= queue.remove();
			
			currentlist.add(currentNode.val);
			
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
		
		result.add(currentlist);
	}
		
		
		return result;
		
	}

}

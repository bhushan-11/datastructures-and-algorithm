package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ListPalindromeArraylist {
  
  
  public boolean isPalindromeArrayList (ListNode head) {
	  
	  List<Integer> list = new ArrayList<>();	 
	  
	  ListNode currentListNode = head;
	  
	  while(currentListNode != null) {
		  
		  list.add(currentListNode.val);
		  currentListNode = currentListNode.next;
	  }
	  
	  int front=0;
	  int back = list.size()-1;
	  
	  while(front<back) {
		  if(!list.get(front).equals(list.get(back))) {
			  return false;
			 
		  }
		  front++;
		  back --;
	  }
	  return true;
  }
  
  
  
  
  public static void main (String args[]) {
	  
    ListPalindromeArraylist  pListPalindrome = new ListPalindromeArraylist();
    
    ListNode nodelistListNode = new ListNode(1);
    
    nodelistListNode.next = new ListNode(2);
    
   // nodelistListNode.next.next= new ListNode(2);
    
    nodelistListNode.next.next = new  ListNode(3);
    
    while (nodelistListNode!=null) {
    	System.out.println(nodelistListNode.val);
    	nodelistListNode=nodelistListNode.next;    	
    }
    
    System.out.println("main called");
   System.out.println( pListPalindrome.isPalindromeArrayList(nodelistListNode));
    
    
    
  }

}

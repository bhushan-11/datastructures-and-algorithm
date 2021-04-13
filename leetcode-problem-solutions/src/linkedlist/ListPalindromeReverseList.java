package linkedlist;

public class ListPalindromeReverseList {
	
	
	public boolean isPalindrone (ListNode head) {
		
		
		ListNode firstHalfEnd =  endOfFirstHalf(head);
		
		ListNode secondHalfStart= reverseList(firstHalfEnd.next);
		
		ListNode p1=head;
		ListNode p2= secondHalfStart;
		
		boolean result = true;
		
		while (result && p2!=null) {
			if(p1.val !=p2.val) {
				result = false;
			}
			p1=p1.next;
			p2=p2.next;
		}
		
		firstHalfEnd.next=reverseList(secondHalfStart);
		
		return result;
	}

	private ListNode reverseList(ListNode head) {
		// TODO Auto-generated method stub
		
		ListNode prev=null;
		ListNode curr=head;
		
		while(curr!=null) {
			ListNode nextTempNode= curr.next;
			
			curr.next=prev;
			prev=curr;
			curr=nextTempNode;
			
		}
		return prev;
	}

	private ListNode endOfFirstHalf(ListNode head) {
		// TODO Auto-generated method stub
		
		ListNode fastNode=head;
		
		ListNode slowNode= head;
		
		while(fastNode.next!=null && fastNode.next.next!=null) {
			fastNode=fastNode.next.next;
			slowNode=slowNode.next;
		}
		
		return slowNode;
	}
	
	
	public static void main(String args[]) {
		
		ListPalindromeReverseList listPalindromeReverseList= new ListPalindromeReverseList()
;		
		ListNode nodelistListNode = new ListNode(1);
	    
	    nodelistListNode.next = new ListNode(2);
	    
	   // nodelistListNode.next.next= new ListNode(2);
	    
	    nodelistListNode.next.next = new  ListNode(3);
	    
	    while (nodelistListNode!=null) {
	    	System.out.println(nodelistListNode.val);
	    	nodelistListNode=nodelistListNode.next;    	
	    }
	    
	    System.out.println("main called");
	   System.out.println( listPalindromeReverseList.isPalindrone(nodelistListNode));
	    
	}

}

package linkedlist;

public class LoopPoint {
	
	public ListNode findIntersectNode(ListNode head) {
	
	ListNode faster= head;
	
	ListNode slower = head.next;
	
	while(faster !=null || faster.next !=null) {
		
		faster = faster.next.next;
		slower = slower.next;
		
		if(slower == faster) {
			return slower;
		}
		
		
	}
	
	return null;
	
	}
	
	
	ListNode detectCycle(ListNode head) {
		
		
		if(head == null) {
			return null;
		}
		
		ListNode intersect = findIntersectNode(head);
		
		ListNode ptr1= head;
		ListNode ptr2= intersect;
		
		while(ptr1 != ptr2) {
			ptr1=ptr1.next;
			
			ptr2 = ptr2.next;
		}
		
		
		return ptr2;
	}
}

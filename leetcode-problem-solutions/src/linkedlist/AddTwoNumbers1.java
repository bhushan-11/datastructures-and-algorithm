package linkedlist;

import java.util.Arrays;

public class AddTwoNumbers1 {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode dummy_head=new ListNode(0); // so that we could use it as head of result l3
		
		ListNode l3=dummy_head; // point dummy head to new list l3
		int carry=0;
		
		while(l1 !=null || l2!=null) {
			
			int val1= (l1!=null) ? l1.val:0;
			int val2= (l1!=null) ? l2.val:0;
			
			int current_sum= val1+val2+carry;
			
			int ones_place=current_sum/10;
			
			
			ListNode newNode= new ListNode(ones_place);

			l3.next=newNode;
			
			if(l1!=null) l1=l1.next;
			if(l2!=null)l2=l2.next;
			l3=l3.next;
		}
		
		
		
		if(carry>0) {
			ListNode new_CarryNode = new ListNode(carry);
			l3.next=new_CarryNode;
			l3=l3.next;
		}
		
		return dummy_head.next; // return next of dummy_head as head of l3
	}
	
	public  static void main (String args) {
		
		
		
	}

}

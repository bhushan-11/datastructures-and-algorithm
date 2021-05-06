package stack;

import java.util.Stack;


public class MyQueue_using_two_Stacks<T> {
	
	Stack<T> stacknewest, stackoldest;
	
	public MyQueue_using_two_Stacks(){
		//no need to put the generic in constructor definition
		
		stacknewest = new Stack<T>();  //initializeing the two stacks in queue constructor
		
		stackoldest = new Stack<T>();
	}

	
	public int size() {
		
		return stacknewest.size()+ stackoldest.size();
		
	}
	
	public void add(T value) {
		
		stacknewest.add(value);   //always add the new element on top of neweststack
		
	}
	
	public void stackShift() {
		
		if(stackoldest.isEmpty()) {  //if the old stack is empty shift all elements from newest to it
			while(!stacknewest.isEmpty()) {
				stackoldest.add(stacknewest.pop());
			}
		}
	}
	
	
	public T peek() {
		stackShift();
		return stackoldest.peek();
	}
	
	public T remove() {
		stackShift();
		return stackoldest.pop();
	}
	
	public static void main(String args[]) {
		
		MyQueue_using_two_Stacks<Integer> myQueue_using_two_Stacks = new MyQueue_using_two_Stacks<>();
		
		myQueue_using_two_Stacks.add(1);
		myQueue_using_two_Stacks.add(2);
		myQueue_using_two_Stacks.add(3);
		System.out.println(myQueue_using_two_Stacks.peek());
		myQueue_using_two_Stacks.remove();
		
		myQueue_using_two_Stacks.add(4);
		myQueue_using_two_Stacks.add(5);
		System.out.println(myQueue_using_two_Stacks.peek());

		;
		}
}

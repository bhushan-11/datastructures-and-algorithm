package stack;

public class ImplementStackArray {

	private	int capacity;
	private	int top;
	private	int [] array;
		public ImplementStackArray(int capacity) {
			super();
			this.capacity = capacity;
			this.top = -1;;
			this.array = new int[capacity];
		}
		
		
		public void push(int data) {
			
			if(isFull()) {
				throw new RuntimeException("Stack is full");
			}
			else {
		array[++top]= data;
			}
			
		}
		
		public int pop() {
			
			if(isEmpty()) {
				throw new RuntimeException("Stack is empty");
			}
			else {
			return array[top--];
			}
			
			
		}
		
		public int peek() {
			
			if(isEmpty()) {
				throw new RuntimeException("Stack is empty");
			}
			else {
			
			return array[top];
			}
		}
		
		public boolean isFull() {
			
			return top==capacity-1;
		}
		
public boolean isEmpty() {
			
			return top==-1;
		}


public static void main (String args[]) {
	
	ImplementStackArray stack = new ImplementStackArray(5);
	
	stack.push(5);
	stack.push(4);
	stack.push(3);
	stack.push(2);
	stack.push(1);
	
	
	int count=stack.capacity-1;
    while(count != -1) {
    	System.err.println(stack.array[count--]);
    }
}
		
		
	
}

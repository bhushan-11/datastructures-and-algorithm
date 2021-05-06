package queue;


public class ImplementQueue_Array {
	
	private int queue[] = new int [5];
	
	private int front;
	private int rear;
	
	private int size;
	
	
	public void show() {
		
		System.out.println("Elements in queue : ");
		for (int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5] +"  ");
			
		}
		for(int n : queue) {
			System.out.print(n+ "  ");
		}
	}
	
	
	public boolean isFull() {
		return getSize()==5;
	}
	
	public boolean isEmpty() {
		return getSize()==0;
	}
	
	
	public int getSize() {
		return size;
	}
	
	public void enqueue(int data) {
		
		if(!isFull()) {
		
		queue[rear]=data;
		rear =(rear+1)%5;
		size ++;
		}
		else {
			System.out.println("Stack is full");
			}
	}
	
	public int dequeue() {
		
		int data= queue[front];
		if(!isEmpty()) {
		
		front=(front+1)%5;
		size --;
		}
		else {System.out.print("Stack is empty");
		}
		
		return data;
	}
	
	public static void main (String args[]) {
		ImplementQueue_Array qArray = new ImplementQueue_Array();
		
//		qArray.enqueue(1);
//		qArray.enqueue(2);
//		qArray.enqueue(3);
//		qArray.enqueue(4);
//		qArray.enqueue(5);
//		
		qArray.show();
		
		qArray.dequeue();

		qArray.dequeue();
		
	qArray.enqueue(6);
//		qArray.enqueue(7);

		qArray.show();
		
	}
}

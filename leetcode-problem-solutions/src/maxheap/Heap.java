package maxheap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>>{
	
	private ArrayList <T> items;
	
	public Heap(){
		
		items=new ArrayList<T>();
		}
	
	private void siftup() {
		int k= items.size()-1;  //position of the last element
		
		while(k >0) {
			
			int p=(k-1)/2; // get the parent
			
			T item =items.get(k);
			T parenT= items.get(p);
			
			if(item.compareTo(parenT)>0) {
				//T temp= items.get(p);
				items.set(k, parenT);
				items.set(p, item);
				k=p;
			}
			else {
				break;
			}
		}
		
	}
	
	private void siftdown() {
		int k=0;
		int l=2*k+1;
		
		while(l<items.size()) {
			int max=l;
			int r=l+1;
			if(r<items.size()) {  //there is a right child
				if(items.get(l).compareTo(items.get(r))>0) {
					T tempT=items.get(k);;
					items.set(k, items.get(max));
					items.set(max, tempT);
					k=max;l=2*k+1;
					
					
				}
			}
			else {
				break;
			}
		}
		
	}

}

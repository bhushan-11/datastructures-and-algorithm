package observer;

import java.util.ArrayList;
import java.util.List;



public class Channel {
	
	private String title;
	


	private List<Subscriber> observers= new ArrayList<>() ;
	
	public void addSubscribers(Subscriber s) {
		
		observers.add(s);
		
	}
	
	public void removeSubscriber(Subscriber s) {
		observers.remove(s);
	}
	
	
	
	public void upload(String video) {
		
		this.title=video;
		
		notifyAllSubscribers();
		
	}
	
	public void notifyAllSubscribers() {
		
		for(Subscriber sub: observers) {
			
			sub.update();
		}
	}
}

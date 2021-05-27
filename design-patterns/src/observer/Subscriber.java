package observer;


public class Subscriber {

	private String nameString ;
	private Channel channel = new Channel();
	
	public Subscriber(String nameString) {
		super();
		this.nameString = nameString;
	}

	public void update() {
		
		System.out.println("hey "+ nameString +", video updloaded");
		
		}
	
	public void subscribeChannel(Channel ch) {
		
		channel=ch;
	}
	
	
}

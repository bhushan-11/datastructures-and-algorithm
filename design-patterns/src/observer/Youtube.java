package observer;

public class Youtube {
	
	public static void main(String args[]) {
		
		
		Channel channel = new Channel();
		


		Subscriber s1= new Subscriber("bhushan");
		Subscriber s2= new Subscriber("vidya");
		Subscriber s3= new Subscriber("suwarna");
		Subscriber s4= new Subscriber("rahul");
		Subscriber s5= new Subscriber("sachin");
		
		channel.addSubscribers(s5);
		channel.addSubscribers(s4);
		channel.addSubscribers(s3);
		channel.addSubscribers(s2);
		
		channel.addSubscribers(s1);
		
		

		s1.subscribeChannel(channel);
		s2.subscribeChannel(channel);
		s3.subscribeChannel(channel);
		s4.subscribeChannel(channel);
		s5.subscribeChannel(channel);
		
		channel.upload("A new video on youtube");
		

	}

}

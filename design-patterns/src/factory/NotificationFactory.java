package factory;

public class NotificationFactory {

	
	public Notification createNotification(String choice) {
		
		switch(choice) {
		
		case "email" : {
			return new EmailNotification();
		}
		case "push" : {
			return new PushNotification();
		}
		case "sms" : {
			return new SMSNotification();
		}
		default  : {
			return new EmailNotification();
		}
		}
		
	
	}
}

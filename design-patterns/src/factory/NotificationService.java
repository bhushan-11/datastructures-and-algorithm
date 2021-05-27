package factory;

public class NotificationService {
	
	public static void main(String args[]) {
		
		
		NotificationFactory nFactory = new NotificationFactory();
		
		Notification notification = nFactory.createNotification("sms");
		
		notification.notifyUser();
		
		
	}

}

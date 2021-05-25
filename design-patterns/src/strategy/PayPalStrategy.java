package strategy;

public class PayPalStrategy implements PaymentStrategy {
	//strategy implementations (provided) 
	private String emailid;
	private String password;
	
	

	public String getEmailid() {
		return emailid;
	}



	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public PayPalStrategy(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}



	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		
		System.out.println(amount + " paid using paypal strategy");
		
		
	}

}

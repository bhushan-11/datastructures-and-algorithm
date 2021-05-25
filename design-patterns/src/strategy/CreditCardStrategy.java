package strategy;

public class CreditCardStrategy implements PaymentStrategy{
	
	private String name;
	private String cardnumber;
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getCardnumber() {
		return cardnumber;
	}




	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}




	public String getCvv() {
		return cvv;
	}




	public void setCvv(String cvv) {
		this.cvv = cvv;
	}




	public String getDateofExpiry() {
		return dateofExpiry;
	}




	public void setDateofExpiry(String dateofExpiry) {
		this.dateofExpiry = dateofExpiry;
	}




	private String cvv;
	private String dateofExpiry;
	
	
	

	public CreditCardStrategy(String name, String cardnumber, String cvv, String dateofExpiry) {
		super();
		this.name = name;
		this.cardnumber = cardnumber;
		this.cvv = cvv;
		this.dateofExpiry = dateofExpiry;
	}




	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		
		System.out.println(amount+ "paid using the credit card strategy");
		
	}





}

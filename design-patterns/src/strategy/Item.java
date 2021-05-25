package strategy;

public class Item {

	private String upcodeString;
	private int price ;
	public String getUpcodeString() {
		return upcodeString;
	}
	public void setUpcodeString(String upcodeString) {
		this.upcodeString = upcodeString;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Item(String upcodeString, int price) {
		super();
		this.upcodeString = upcodeString;
		this.price = price;
	}
	
	
	
	
}

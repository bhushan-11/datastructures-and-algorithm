package strategy;


public class ShoppingCartTest {
	
	public static void main ( String argString []) {
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(new Item("1234", 10));
		
		cart.addItem(new Item("2345", 40));
		
	
		
		cart.pay(new CreditCardStrategy("bhushan", "2323434", "660", "date"));
		
		cart.pay(new PayPalStrategy("bhushan", "password"));
	}

}

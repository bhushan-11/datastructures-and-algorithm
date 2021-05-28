package adapter;

public class MaxSpeedApp {

	
	public static void main(String args[]) {
	Movable bugattiveryonMovable= new BugattiVeyron();
	
	MovableAdapter bugattiveryonAdapter= new MovableAdapterImpl(bugattiveryonMovable);
	
	System.out.println(bugattiveryonAdapter.getSpeed());
	

	}
	

}

package adapter;

public class MovableAdapterImpl implements MovableAdapter {
	
	private Movable luxuryCars;   //implementation of original interface , object of original is created on adapter to call original methods

	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {   //provide our own implementation of getspeed so that it returns kmph
		// TODO Auto-generated method stub
		return converMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double converMPHtoKMPH(double mphspeed) {   //added more functionality to the Adapter interface
		// TODO Auto-generated method stub
		return mphspeed*1.6093;
	}
	
	

}

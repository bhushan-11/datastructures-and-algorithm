package state;

public class Context  {
	
	private State state;
	//The behavior of context changes depending on the internal state
	public void setState(State state) {
		
		this.state=state;
	}
	
	public State getState() {
		
		return this.state;
	}

}

package state;

public class StateDemo {

	
	public static void main(String args[]) {
		
		Context context= new Context();
		
		State startState= new StartState();
		 
		
		startState.doAction(context); // do action is delegated  to the state by context
		System.out.println(context.getState().toString());
		
		State stopState= new StopState();
		
		stopState.doAction(context);
		
		
		System.out.println(context.getState().toString());
	}
}

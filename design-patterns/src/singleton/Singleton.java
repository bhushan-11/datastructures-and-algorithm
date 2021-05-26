package singleton;

public class Singleton {
	
	public String string;
	
	private static int count=0;
	
	private Singleton() {   //We need to make the constructor as private so the class cannot be instantiated from outside the class
		
		count++;
		System.out.println("count value so far" + count);
		string= "I am string part of the Singleton class";
	}

	
	private static Singleton single_instance=null;   // we need to provide a private static variable for global access
	
	public static Singleton getInstance() {
		
		
		if(single_instance==null) {
			
			single_instance= new Singleton();	
			
		}
		return single_instance;
	}
	
	
	public void printDetails(String message) {
		
		System.out.println(message);
	}
	
	public static void main ( String args[]) {
		
		
		Singleton x = Singleton.getInstance() ; // first instantiation of the Singleton class
		
		
		Singleton ySingleton = Singleton.getInstance(); // all other instances after it will point to the first instance 
		
		Singleton zSingleton= Singleton.getInstance();  // and any change on the variale s (String ) of the object x will reflect on respective values of  s on y and z 
		
		x.string= (x.string).toUpperCase();   //variable s for all three variables x,y and z will be affected
		
		
		System.out.println("String from x is "+ x.string);
		
		System.out.println("String from y is "+ ySingleton.string);

		
		System.out.println("String from z is "+ zSingleton.string);
		
		zSingleton.string=(zSingleton.string).toLowerCase(); // similarly this will affeect the string variable of other variables x,y
		
		

		System.out.println("String from x is "+ x.string);
		
		System.out.println("String from y is "+ ySingleton.string);

		
		System.out.println("String from z is "+ zSingleton.string);
		
		
		// Another example of multiple instnaces vs one instances
		
		//Say in the below example we need to call print details from multiple classes ex fromstudent fromemployee 
		//we would like to use singleton in these cases as well so we dont instantiate multiple times 
		
		
		Singleton fromEmployee= Singleton.getInstance();
		
		fromEmployee.printDetails("This is a message from Employee");
		
		Singleton fromStudent = Singleton.getInstance();
		
		fromStudent.printDetails("This is a message from Student");
	}
}

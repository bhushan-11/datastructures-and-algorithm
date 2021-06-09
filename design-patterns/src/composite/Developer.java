package composite;

public class Developer implements Employee{
	
	private String name;
	private long empId;
	private String operation;

	public Developer(String name, long empId, String operation) {
		super();
		this.name = name;
		this.empId = empId;
		this.operation = operation;
	}

	@Override
	public void displayEmployeeDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Employee details: "+ empId+ ":"+ name);
		
	}

}

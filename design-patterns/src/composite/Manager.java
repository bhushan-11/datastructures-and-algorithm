package composite;

public class Manager  implements Employee {
//leaf like a Developer that implements component interface
	
	private String name;
	private long empId;
	public Manager(String name, long empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	@Override
	public void displayEmployeeDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Employee details :"+ empId +":" + name);
		
	}// leaf like a Developer that implements component interface 

}

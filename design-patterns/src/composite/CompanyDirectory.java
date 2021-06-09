package composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{
	
	//note that the composite too implements the interface so that it can provide the implementation to common methods
	
	List<Employee> employeeList= new ArrayList<>();
	
	
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}
	
	public void removeEmployee(Employee emp) {
		employeeList.remove(emp);
	}
	
	@Override
	public void displayEmployeeDetails() {
		
		for (Employee emp:employeeList) {
			emp.displayEmployeeDetails();
		}
		// TODO Auto-generated method stub
		
	}
	
	//This is a composite component of this pattern it saves the leaf /child

}

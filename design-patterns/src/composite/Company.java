package composite;


public class Company {

	
	public static void main(String args[]) {
	//client --> here we will create the leafs , composites from those and further composites
	
	Developer developer1= new Developer("Vidya", 1, "Android");
	
	Developer dev2 = new Developer("Bhushan", 2, "Java");
	
	CompanyDirectory enggDirectory= new CompanyDirectory();
	
	enggDirectory.addEmployee(developer1);
	enggDirectory.addEmployee(dev2);
	
	Manager m1= new Manager("Anna", 3);
	
	Manager m2 = new Manager("Christing", 4);
	
	CompanyDirectory magDirectory = new CompanyDirectory();
	
	magDirectory.addEmployee(m1);
	magDirectory.addEmployee(m2);
	
	CompanyDirectory company = new CompanyDirectory();
	company.addEmployee(enggDirectory);
	company.addEmployee(magDirectory);
	
	company.displayEmployeeDetails();
    
	}

}

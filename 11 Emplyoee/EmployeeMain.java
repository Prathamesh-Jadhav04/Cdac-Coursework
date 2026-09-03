
public class EmployeeMain {

	public static void main(String[] args) {
		Employee [] allEmployees = new Employee[3];
		allEmployees[0]=new PermanantEmployee(101,"Shubham Gavali",7500,12500,8500);
		allEmployees[1]=new ContractualEmployee(102,"Prathu Jadhav",7500,12500);
		allEmployees[2]=new PermanantEmployee(103,"Tushar Pathare",3500,2500,4500);
		
		for(Employee currrentEmployee:allEmployees) {
			String empName =currrentEmployee.getName();
			float processedSalary = currrentEmployee.processSalary();
			System.out.println("Name:- "+empName);
			System.out.println("Gross Salary:- "+processedSalary);
			System.out.println("===================================");
		}
	}

}

import java.util.Scanner;

class Employee {
	int empID;
	String empName;
	String empCompany;
	int empSalary;
	
	public Employee() {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empCompany = empCompany;
		this.empSalary = empSalary;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCompany() {
		return empCompany;
	}
	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empCompany=" + empCompany + ", empSalary="
				+ empSalary + "]";
	}
	
	
}


public class EmployeeDetails {
	
	public static void main(String[] args) {
		
		Scanner scanner2 = new Scanner(System.in);
		
		Employee lebron = new Employee();
		
		System.out.println("Enter EmpID");
		lebron.setEmpID(scanner2.nextInt());
		scanner2.nextLine();
		
		System.out.println("Enter EmpName");
		lebron.setEmpName(scanner2.nextLine());
		
		System.out.println("Enter CompanyName");
		lebron.setEmpCompany(scanner2.nextLine());
		
		System.out.println("Enter Salary");
		lebron.setEmpSalary(scanner2.nextInt());
		scanner2.nextLine();
		
		System.out.println(lebron.getEmpName() + " Details : " + lebron.toString());
		
		Employee gasol = new Employee();
		
		System.out.println("Enter EmpID");
		gasol.setEmpID(scanner2.nextInt());
		scanner2.nextLine();
		
		System.out.println("Enter EmpName");
		gasol.setEmpName(scanner2.nextLine());
		
		System.out.println("Enter CompanyName");
		gasol.setEmpCompany(scanner2.nextLine());
		
		System.out.println("Enter Salary");
		gasol.setEmpSalary(scanner2.nextInt());
		scanner2.nextLine();
		
		System.out.println(gasol.getEmpName() + " Details : " + gasol.toString());
		
		scanner2.close();
	}

}

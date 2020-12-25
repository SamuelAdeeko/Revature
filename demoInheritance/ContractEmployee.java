package demoInheritance;

public class ContractEmployee extends Person {

	private String designation;
	private double salary;
	private Project project1;
	private Address address;

	public ContractEmployee(int id, String name, String designation, double salary, Project project1, Address address) {
		super(id, name);
		this.designation = designation;
		this.salary = salary;
		this.project1 = project1;
		this.address = address;
	}

	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int id, String name, String designation, double salary) {
		super(id, name);
		this.designation = designation;
		this.salary = salary;
	}
	public ContractEmployee(int id, String name, String designation, double salary, Project project1) {
		super(id, name);
		this.designation = designation;
		this.salary = salary;
		this.project1 = project1;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ContractEmployee [designation=" + designation + ", salary=" + salary + ", project1=" + project1
				+ ", address=" + address + "]";
	}

	public Project getProject1() {
		return project1;
	}

	public void setProject1(Project project1) {
		this.project1 = project1;
	}
	
	public void printEmployee() {
		System.out.println("\nContract Employee name: " + getName());
		System.out.println("\nContract Employee Id: " + getId());
		System.out.println("\nContract Employee Designation: " + getDesignation());
		System.out.println("\nContract Employee Salary: " + getSalary());
		System.out.println("\nContract Employee Project: " + getProject1());
		System.out.println("\nContract Employee Address: " + getAddress());
	}

	
	

}

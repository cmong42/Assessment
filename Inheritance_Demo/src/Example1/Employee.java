package Example1;

//Employee is-A person
public class Employee extends Person{
//try private Address  presentAddress
	//add has-A relationship Project-pid,name,clientname,cost
	private Address presentAddress;
	private String designation; //has-A
	private double salary;//has-A
	private Address permenantAddress;//has-A
	private Project employeeProject;
	
	public Address getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}

	public Employee(Address presentAddress, String designation, double salary, Address permenantAddress,
			Project employeeProject) {
		super();
		this.presentAddress = presentAddress;
		this.designation = designation;
		this.salary = salary;
		this.permenantAddress = permenantAddress;
		this.employeeProject = employeeProject;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation, double salary) {
		super(id, name);
		this.designation = designation;
		this.salary = salary;
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


	public Address getPermenantAddress() {
		return permenantAddress;
	}

	public void setPermenantAddress(Address permenantAddress) {
		this.permenantAddress = permenantAddress;
	}
	

	public Project getEmployeeProject() {
		return employeeProject;
	}

	public void setEmployeeProject(Project employeeProject) {
		this.employeeProject = employeeProject;
	}

	@Override
	public String toString() {
		return "Employee [presentAddress=" + presentAddress + ", designation=" + designation + ", salary=" + salary
				+ ", permenantAddress=" + permenantAddress + ", employeeProject=" + employeeProject + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		boolean b = false;
		Employee e1=(Employee)o;
		if (this.getId()==e1.getId()) {
			b = true;
		}
		return b;
	}
	
	
}

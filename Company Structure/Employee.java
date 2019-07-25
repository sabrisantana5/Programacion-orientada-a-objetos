public abstract class Employee
{
	protected String name;
	protected double baseSalary;
	protected int EmployeeID;
	protected Employee manager;
	protected int c = 0;

	public Employee(String name, double baseSalary){
		this.name = name;
		this.baseSalary = baseSalary;
		c++;
		EmployeeID = c;
	}

	public double getBaseSalary(){
		return baseSalary;
	}
	public String getName(){
		return name;
	}
	public int getEmployeeID(){
		return EmployeeID;
	}
	public Employee getManager(){
		return manager;
	}
	public boolean equals(Employee other){
		if(this.equals(other)){
			return true;
	}
		return false;
	}
	public String toString(){
		return EmployeeID+" "+name;
	}
	abstract String employeeStatus();
}
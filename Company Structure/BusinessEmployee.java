public class BusinessEmployee extends Employee
{
	protected double bonusBudget;

	public BusinessEmployee(String name){
		super(name,50000);
	}
	public double getBonusBudget(){
		return bonusBudget;
	}
	public String employeeStatus(){
		return toString()+" with a budget of "+bonusBudget;
	}
}
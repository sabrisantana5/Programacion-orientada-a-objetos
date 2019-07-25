public class TechnicalEmployee extends Employee
{
	protected int checkins;

	public TechnicalEmployee(String name){
		super(name,75000);
	}
	@Override
	public String employeeStatus(){
		return toString()+" has "+checkins+" successful check ins.";
	}
}
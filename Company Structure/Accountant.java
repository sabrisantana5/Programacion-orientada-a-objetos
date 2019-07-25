public class Accountant extends BusinessEmployee
{

	public Accountant(String name){
		super(name);
		bonusBudget = 0;
	}

	public Employee getTeamSupported(){
		return manager;
	}
	public void supportTeam(TechnicalLead lead){
		manager = lead;
		bonusBudget = ((4-lead.getHeadCount())*75000)+(.10*((4-lead.getHeadCount())*75000));
	}
	public boolean approveBonus(double bonus){
		if((bonus>bonusBudget)||(manager==null)){
			return false;
	}
			bonusBudget-=bonus;
			return true;
	}
	public String employeeStatus(){
		return super.employeeStatus()+" is suporting "+manager;
	}
}
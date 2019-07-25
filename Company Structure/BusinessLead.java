import java.util.ArrayList;
public class BusinessLead extends BusinessEmployee
{
	private int headcount;

	ArrayList<Accountant> directreports = new ArrayList<Accountant>();

	public BusinessLead(String name){
		super(name);
		baseSalary = baseSalary*2;
		headcount = 10;
	}

	public boolean hasHeadCount(){
		if(directreports.size()<headcount){
		return true;
	}
		return false;
	}

	public boolean addReport(Accountant e, TechnicalLead supportTeam){
		if(hasHeadCount()==true){
			directreports.add(e);
			bonusBudget += e.baseSalary*1.1;
		return true;
		}
		return false;
	}
	public boolean requestBonus(BusinessEmployee e, double bonus){
		if (bonusBudget>bonus){
			e.bonusBudget += bonus;
			bonusBudget -= bonus;
			return true;
		}
		return false;
	}
	public boolean approveBonus(Employee e, double bonus){
		for(Accountant a : directreports){
		if((a.getManager()).equals(e.manager)){
			if(a.getBonusBudget()>bonus){
				a.bonusBudget-=bonus;
				return true;
			}
		}
	}
	return false;
}
}
import java.util.ArrayList;
public class TechnicalLead extends TechnicalEmployee
{
	ArrayList<SoftwareEngineer> directreports = new ArrayList<SoftwareEngineer>();

	private int headcount;
	private BusinessLead bl;
	String imprime="";

	public TechnicalLead(String name){
		super(name);
		baseSalary = baseSalary*1.3;
		headcount = 4;
	}

	public int getHeadCount(){
		return headcount;
	}
	public boolean hasHeadCount(){
		if(directreports.size()<headcount){
		return true;
	}
		return false;
	}

	public boolean addReport(SoftwareEngineer e){
		if(hasHeadCount()){
			directreports.add(e);
			headcount--;
		return true;
	}
		return false;
	}

	public boolean approveCheckIn(SoftwareEngineer e){
		if((directreports.contains(e))&&(e.getCodeAccess())){
		return true;
			}
		return false;
	}

	public boolean requestBonus(Employee e, double bonus){
		if(bl.approveBonus(e,bonus)==true){
			baseSalary+=bonus;
		return true;
	}
		return false;
	}
	public String getTeamStatus(){
		if (directreports.size()==0){
				imprime = null;
		}
		else{
			imprime = "";
		for(SoftwareEngineer i : directreports)
		{
			imprime += i.employeeStatus();
		}
		}
	return employeeStatus()+" is managing: "+ imprime;
	}

}
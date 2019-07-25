public class SoftwareEngineer extends TechnicalEmployee
{
	private boolean access;

	public SoftwareEngineer(String name){
		super(name);
		access=false;
		checkins = 0;
	}
	public boolean getCodeAccess(){
		return access;
	}
	public boolean setCodeAccess(boolean a){
		access = a;
		return a;
	}

	public int getSuccessfulCheckIns(){
		return checkins;
	}
	public boolean checkInCode(){
		//if(manager.approveCheckIn(this)==true){
			checkins++;
		return true;
	}
		//access = false;
		//return false;
	//}
}
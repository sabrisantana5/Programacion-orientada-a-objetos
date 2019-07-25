public class Company
{
	public static void main(String[] args)
	{
 	   TechnicalLead TL = new TechnicalLead("Sabri Lopez");
 	   BusinessLead BL = new BusinessLead("Daniel Leon");
 	   SoftwareEngineer SE = new SoftwareEngineer("Sofia Laz");
 	   Accountant A = new Accountant("Bpebpe");

 	  System.out.println(TL.getTeamStatus());
	      System.out.println(BL.employeeStatus());
	      TL.addReport(SE);
	      SE.checkInCode();
    System.out.println(TL.getTeamStatus());
	}
}
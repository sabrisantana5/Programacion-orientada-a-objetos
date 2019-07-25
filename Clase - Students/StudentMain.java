public class StudentMain
{
	public static void main(String[] args)
	{
		Student p1 = new Student("Sabrina",5397);

		System.out.println(p1.getName());
		System.out.println(p1.getID());
		System.out.println(p1.getUnits());
		p1.incrementUnits(150);
		System.out.println(p1.hasEnoughUnits());
		p1.incrementUnits(50);
		System.out.println(p1.hasEnoughUnits());
		System.out.println(p1.toString());
	}
}
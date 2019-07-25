public class MainCirculo
{
	public static void main (String[] args)
	{
		Circulo c = new Circulo(1,1,1);
		c.print();

		System.out.println("Diametro: "+c.getDiametro());
		System.out.println("Circunferencia: "+c.getCircunferencia());
		System.out.println("Area: "+c.getArea());
	}
}
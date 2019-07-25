public class Circulo extends Punto
{
	private int  radio;
	private Punto p;
	public Circulo(int x, int y, int radio)
	{
		//super(); lo hace automatico por la herencia, necesitamos llamar un constructor
		super(x,y);
		this.radio = radio;
	}

	public int getRadio(){return radio;}
	public int getDiametro(){return 2*radio;}
	public double getCircunferencia()
	{
		double r;
		r = (double)radio;
		return r*3.1416;
	}
	public double getArea()
	{
		double r;
		r = (double)radio;
		return r*r*3.1415;
	}

	public void print()
	{
		super.print();
		System.out.printf("Radio = %d%n",radio);
	}
}
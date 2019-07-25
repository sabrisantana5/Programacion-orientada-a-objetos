public class Circulo implements Figura
{	private double r;
	private final double pi = 3.1416;
	public Circulo(double r)
	{	//super(color);
		this.r = r;
	}
	@Override
	public double area()
	{	return pi*r*r;	}
	@Override
	public double perimetro()
	{	return(2*pi)*r;	}
}
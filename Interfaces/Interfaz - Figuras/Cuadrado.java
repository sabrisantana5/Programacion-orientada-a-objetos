public class Cuadrado implements Figura
{	private double x;
	public Cuadrado(double x)
	{	this.x = x;	}
	@Override
	public double area()
	{		return x*x;		}
	@Override
	public double perimetro()
	{		return 4*x;		}
}
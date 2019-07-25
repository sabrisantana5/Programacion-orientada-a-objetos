public class Rectangulo extends Figura
{
	private double x;
	private double y;

	public Rectangulo(String color, double x, double y)
	{
		super(color); //siempre la primera linea del constructor
		this.x = x;
		this.y = y;
	}

	@Override //identifica que estas sobreescribiendo un metodo ya definido
	public double area() //si pones Area() estas sobreescribiendo otro metodo, es para protegerte de que no te falle
	{
		return x*y;
	}
	@Override
	public double perimetro()
	{
		return 4*x;
	}
}
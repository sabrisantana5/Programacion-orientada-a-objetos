public abstract class Figura
{
	protected String color;

	public Figura(String color)
	{
		this.color = color;
	}
	abstract double area();
	abstract double perimetro();

	public String getColor(){return color;}
}
//protegido para acceder desde otras clases, private para que no accedan directamente(necesitas get y set para manipular)
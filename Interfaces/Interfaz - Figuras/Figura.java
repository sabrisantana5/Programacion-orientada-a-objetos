public interface Figura
{	//las variables declaradas en una interfaz con públicas, estáticas y final por default. Las variables de las interfaces deben ser inicializadas en el momento de la declaración, de otra forma e compilador enviará un error.
	public String color = "rojo";
	public double area();
	public double perimetro();
}
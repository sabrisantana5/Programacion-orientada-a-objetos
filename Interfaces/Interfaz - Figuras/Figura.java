public interface Figura
{	//las variables declaradas en una interfaz con p�blicas, est�ticas y final por default. Las variables de las interfaces deben ser inicializadas en el momento de la declaraci�n, de otra forma e compilador enviar� un error.
	public String color = "rojo";
	public double area();
	public double perimetro();
}
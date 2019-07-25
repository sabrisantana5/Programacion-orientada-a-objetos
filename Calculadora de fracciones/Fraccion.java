import java.util.InputMismatchException;
public class Fraccion
{
	private int numerador;
	private int denominador;

	public Fraccion()
	{
		this(0,1);
	}
	public Fraccion(int numerador)
	{
		this(numerador,1);
	}
	public Fraccion(int numerador, int denominador) throws InputMismatchException
	{
		this.numerador = numerador;
		if(denominador==0)
		{
			throw new ArithmeticException("El denominador no puede ser 0");
		}
		else if(denominador<0)
		{
			this.numerador = -1*numerador;
			this.denominador = -1*denominador;
		}
		else
		{
		this.denominador = denominador;
		}
	}

	public int getNumerador()
	{
		return numerador;
	}

	public int getDenominador()
	{
		return denominador;
	}
	public String toString()
	{
		return numerador+"/"+denominador;
	}
	public double toDouble()
	{
		return (double)numerador/(double)denominador;
	}
	public String toLowestTerms() //convierte en los terminos mas bajos
	{
	 int g = gcd(numerador,denominador);
	 numerador = numerador/g;
	 denominador = denominador/g;
	 return toString();
	}
	public Fraccion add(Fraccion f)
	{
		Fraccion c = new Fraccion();
    	c.numerador=numerador*f.denominador+f.numerador*denominador;
    	c.denominador=denominador*f.denominador;
		return c;
	}
	public Fraccion substract(Fraccion f)
	{
		Fraccion c = new Fraccion();
    	c.numerador=numerador*f.denominador-f.numerador*denominador;
    	c.denominador=denominador*f.denominador;
		return c;
	}
	public Fraccion multiply(Fraccion f)
	{
		Fraccion c = new Fraccion();
    	c.numerador=numerador*f.numerador;
    	c.denominador=denominador*f.denominador;
		return c;
	}
	public Fraccion divide(Fraccion f)  throws InputMismatchException
	{
		if(denominador==0)
		{
			throw new ArithmeticException("El denominador no puede ser 0");
		}

		Fraccion c = new Fraccion();
		c.numerador = numerador*f.denominador;
		c.denominador = denominador*f.numerador;
		return c;
	}

	public boolean equals(Object o)
	{
	if (o instanceof Fraccion)
	{
		Fraccion no = (Fraccion)o;
		if (no.toDouble() == this.toDouble())
		{
			System.out.println("Las fracciones son iguales");
		}
		else
		{
			System.out.println("Las fracciones no son iguales");
		}
	}
	else
	{
		System.out.println("Los objetos no son iguales");
	}
	return o instanceof Fraccion;

	}

	public static int gcd(int n, int d ) //n debe ser mayor o igual a d
	{
		if(d==0)
		return n;

		else
		return gcd(d,n%d);
	}

}
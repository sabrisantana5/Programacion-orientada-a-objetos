public class Empleado
{
	private String nombre;
	private String apellidom;
	private String apellidop;
	private long numemp;
	private long sueldo;

	public Empleado()
	{
		sueldo = 10000;
	}
	public Empleado(long sueldo)
	{
		this.sueldo = sueldo;
	}
	public Empleado(String nombre, String apellidom, String apellidop,long numemp )
	{
		this.nombre = nombre;
		this.apellidom = apellidom;
		this.apellidop = apellidop;
		if ((1000000<numemp)||(numemp<1))
		{
		numemp = 0;
		System.out.println("Numero de empleado no valido");
		}
		else
		this.numemp = numemp;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public void setApellidom(String apellidom)
	{
		this.apellidom = apellidom;
	}
	public void setApellidop(String apellidop)
	{
		this.apellidop = apellidop;
	}
	public String getNombre()
	{
		return nombre;
	}
	public String getApellidom()
	{
		return apellidom;
	}
	public String getApellidop()
	{
		return apellidop;
	}
	public void setNumemp(long numemp)
	{
		if ((1000000<numemp)||(numemp<1))
		{
		numemp = 0;
		System.out.println("Numero de empleado no valido");
		}
		else
		this.numemp = numemp;
	}
	public String compara(Empleado e2)
	{
		String iguales = "Tienen el mismo sueldo";
		if(sueldo>e2.sueldo)
		return nombre;
		else if (e2.sueldo>sueldo)
		return e2.nombre;
		else
		return iguales;
	}

}

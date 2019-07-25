public class Persona
{
	private String nombre;
	private Direccion direccion;
	private Fecha fechanacimiento;
	public Persona(){ }
	public Persona(String nombre, Direccion direccion, Fecha fechanacimiento)
	{	this.nombre = nombre;
		this.direccion = direccion;
		this.fechanacimiento = fechanacimiento;
	}
	public String getNombre(){return nombre;}
	public Direccion getDireccion(){return direccion;}
	public Fecha getFecha(){return fechanacimiento;}
	public void setNombre(String nombre){	this.nombre = nombre;	}
	public void setDireccion(Direccion direccion){	this.direccion = direccion;		}
	public void setFecha(Fecha fechanacimiento){	this.fechanacimiento = fechanacimiento;		}

	public boolean esMayorDeEdad(Fecha fechaactual)
	{	if((fechaactual.getAnio()-fechanacimiento.getAnio())>=18)
		return true;
		else
		return false;
	}
	public String toString()
	{	String info;
		return "Nombre: "+nombre+"\nFecha de nacimiento"+fechanacimiento.getDia()+""+fechanacimiento.getMes()+""+fechanacimiento.getAnio()+"\nDireccion: "+direccion.getCalle()+direccion.getNumero()+direccion.getCp()+direccion.getCiudad();
	}
}
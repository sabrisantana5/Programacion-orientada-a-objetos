//Se tiene que hacer un metodo por variable para asignarles un valor, Las variables tienen que ser private,constructor-publicos darle valor a los atributos, es automatico con valores nulos.
public class Persona
{
	private String nombre;
	private String apellido;
	private int edad;
	private String alias;
	/*public Persona() //constructor, no ponerle valor de retorno ni void,//es para que no tengas nulos o ceros que pone el constructor de java
	{   nombre = "Generico";
		apellido = "Generico";
		edad = 20;
		alias = "Sr";	} */
	public Persona()
	{
		edad = 17;
	}
	//hay que poner este default siempre que quiera crear mas constructores
	public Persona(String nombre) //si tu creas uno explicito java ya no se molesta en el automatico
	{
		this.alias = alias; //null
		this.nombre = nombre; //null
	}
	public Persona(String nombre, String apellido, int edad, String alias)
	{	this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.alias = alias;	}
	public void setNombre(String nombre)
	{	this.nombre = nombre;	} //se le asigna el arg a la variable del programa
	public void setApellido(String apellido) {	this.apellido = apellido;}
	public void setEdad(int edad)		{	this.edad = edad;}
	public void setAlias(String alias)	{	this.alias = alias;	}
	public String getNombre()			{	return nombre;	}
	public String getApellido()			{	return apellido;	}
	public int getEdad()				{	return edad;	}
	public String getAlias()			{	return alias;}
	public void printPersona()
	{	System.out.println("Persona: " + alias + ". " + nombre + " " + apellido);
		System.out.println("Edad: " + edad);	}
}
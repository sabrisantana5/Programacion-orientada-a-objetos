public class Cliente
{
 	private int id;
 	private String nombre;
 	private String apellido;
 	private int edad;
 	private TarjetaCredito tc;
 	//ArrayList<TarjetaCredito> listaTarjetaCredito = new ArrayList<TarjetaCredito>();

 	private static int count = 0;

 	public Cliente(String nombre, String apellido, int edad)
 	{
		count++;
		this.id = count;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public void setTarjetaCredito(TarjetaCredito tc)
	{
		this.tc = tc;
	}
	public void printCliente()
	{
		System.out.printf("Id: %s\nNombre: %s %s\n",id,nombre,apellido);
		if(tc != null)
			tc.printTC();
		else
			System.out.println("El cliente no tiene asignada tarjeta de crédito");

	}
}
  public class TarjetaCredito
{
	private String number;
	private double balance;
	private Fecha fechaExpiracion; //no es correcto inicializar aqui, debe ser en un constructor
	private Fecha fechaExpedicion;
	private TiposTC tipo;

	public TarjetaCredito(){}

	public TarjetaCredito(String number, double balance, int day, int month, int year, TiposTC tipo)
	{
		this.number = number;
		this.balance = balance;
		fechaExpiracion = new Fecha(day, month, year-5); //variable de otra clase dentro de esta clase
		fechaExpedicion = new Fecha(day, month, year);
		this.tipo = tipo;
	}
	public TarjetaCredito(String number, double balance, int day, int month, int year)
	{
		this.number = number;
		this.balance = balance;
		fechaExpiracion = new Fecha(day, month, year-5); //variable de otra clase dentro de esta clase
		fechaExpedicion = new Fecha(day, month, year);
	}

	public String getNumero()
	{
		return number;
	}
	public double getSaldo()
	{
		return balance;
	}
	public void setTipoTC(TiposTC tipo)
	{
		this.tipo = tipo;
	}
	public void compras(double cantidad)
	{
		if(cantidad > balance)
		{
			System.out.println("Fondos insuficientes");
		}
		else
		{
			balance = balance - cantidad;
		}
	}
	public void printTipo()
	{
			System.out.println("Tipo de tarjeta: "+tipo);
			System.out.printf("Tasa de interes mensual: %.2f\n",tipo.CalcTIM());
			System.out.printf("Tasa de interes anual: %.2f\n",tipo.CalcTIA());
	}
	public void printTC()
	{
		System.out.printf("Tarjeta de Crédito: %s\nSaldo: %.2f\n", number, balance);
		System.out.printf("Fecha de Expiración: %s\nFecha de Expedición: %s\n",fechaExpiracion.FormatoFecha(),fechaExpedicion.FormatoFecha());
	}
}

public class Fecha
{
	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio)
	{
		//revisar si el mes,anio y dia estan en el rango
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public String FormatoFecha()
	{
		return String.format("%2d/%2d/%d",dia,mes,anio);//printf, utiliza solo dos primeros digitos, no redondea
	}
}
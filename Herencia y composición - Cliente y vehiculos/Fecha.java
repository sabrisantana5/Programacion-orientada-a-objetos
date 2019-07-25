public class Fecha
{
	private int dia;
	private int mes;
	private int ano;

	public Fecha(int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}

	public int calculaDias(Fecha f){
		dia = dia - f.dia;
		mes = mes - f.mes;
		ano = ano - f.ano;
		return (dia+(mes*30)+(ano*365));
	}

	public int calculaTiempoRenta(){
		return (dia+(mes*30)+(ano*365));
	}
}
public abstract class Vehiculo
{
	protected String marca;
	protected String matricula;
	protected int noID;
	protected int noKM;
	protected double estadoGas;
	protected int ano;
	protected static int anoActual;

	protected boolean enRenta=false;
	protected Fecha renta;

	public Vehiculo(String marca, String matricula, int noID, int noKM, double estadoGas, int ano){
		this.marca = marca;
		this.matricula = matricula;
		this.noID = noID;
		this.noKM = noKM;
		this.estadoGas = estadoGas;
		this.ano = ano;
	}
	//metodos que comparten
	public static void setAnoActual(int a){
		anoActual = a;
	}
	public void rentar(Fecha r){
		enRenta=true;
		renta = r;
	}
	public int estaRentado(){
		return renta.calculaTiempoRenta();
	}
	//metodos abstractos
	abstract double costoAlquiler(Fecha inicio, Fecha fin, double estadoNuevo);
}
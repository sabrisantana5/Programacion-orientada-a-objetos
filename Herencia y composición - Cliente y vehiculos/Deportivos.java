public class Deportivos extends Vehiculo
{
	private int puertas;
	private boolean turbo;
	private int asientos;
	private int motor;
	private int f;

	private double costoDia=2500.00;
	private double CostoTotal;

	public Deportivos(int puertas, boolean turbo, int asientos, int motor, String m, String mt, int noID, int noKM, double eG, int a){
	super(m,mt,noID,noKM,eG,a);
	this.puertas = puertas;
	this.turbo = turbo;
	this.asientos = asientos;
	this.motor = motor;
	}
	public double getCostoDia(){
	return costoDia;
	}

	public double costoAlquiler(Fecha inicio, Fecha fin, double estadoNuevo){
		f = inicio.calculaDias(fin);
		double temporal = ((anoActual-ano)*100);
		if((costoDia-temporal)<1500){
		costoDia = 1500;
		}
		CostoTotal = costoDia+costoDia*((int)f)+(20*(estadoGas-estadoNuevo));
		return CostoTotal;
	}
	public String toString(){
			if(enRenta){
		return "Marca: "+marca+" Matrícula: "+matricula+" Gas: "+estadoGas+" Año: "+ano+" Costo dia: "+costoDia+" Rentado. Tiempo de renta en dias: "+estaRentado();
			}
		return "Marca: "+marca+" Matrícula: "+matricula+" Gas: "+estadoGas+" Año: "+ano+" Costo dia: "+costoDia;
	}
}
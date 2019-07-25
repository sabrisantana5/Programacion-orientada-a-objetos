public class Motos extends Vehiculo
{
	private double CostoTotal;
	private double costoDia=800.0;
	private int f;

	public Motos(String m, String mt, int noID, int noKM, double eG, int a){
	super(m,mt,noID,noKM,eG,a);
	}

	public double getCostoDia(){
	return costoDia;
	}

	public double costoAlquiler(Fecha inicio, Fecha fin, double estadoNuevo){
		f = inicio.calculaDias(fin);
		costoDia = 20*(estadoGas-estadoNuevo)+((int)f);
		return CostoTotal;
	}
	public String toString(){
			if(enRenta){
		return "Marca: "+marca+" Matrícula: "+matricula+" Gas: "+estadoGas+" Año: "+ano+" Costo dia: "+costoDia+" Rentado. Tiempo de renta en dias: "+estaRentado();
			}
		return "Marca: "+marca+" Matrícula: "+matricula+" Gas: "+estadoGas+" Año: "+ano+" Costo dia: "+costoDia;
	}
}
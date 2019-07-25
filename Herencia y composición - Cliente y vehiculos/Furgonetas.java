public class Furgonetas extends Vehiculo
{
	private double altura;
	private int carga;
	private int f;
	private boolean enRenta=false;
	private Fecha renta;

	private double CostoTotal;
	private double costoDia=2000.00;

	public Furgonetas(double altura, int carga,String m, String mt, int noID, int noKM, double eG, int a){
	super(m,mt,noID,noKM,eG,a);
	this.altura = altura;
	this.carga = carga;
	}
	public double getCostoDia(){
	return costoDia;
	}
	public double costoAlquiler(Fecha inicio, Fecha fin, double estadoNuevo){
		f = inicio.calculaDias(fin);
		double temporal = ((anoActual-ano)*100);
		if((costoDia-temporal)<1000){
		costoDia = 1000;
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
import java.util.ArrayList;
public class Cliente
{
	public static void main(String[] args){
	ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
	Fecha fr = new Fecha(10,0,0);

	Vehiculo v1 = new Motos("Ducati","ABC-123",12345,50000,10.5,2016);
	Vehiculo v2 = new Furgonetas(1.75,500,"Chevrolet","CDE-456",67890,40000,15.5,2010);
	Vehiculo v3 = new Deportivos(4, true, 5,300,"Ferrari","FGH-789",101112,20000,20.0,2000);
	Vehiculo.setAnoActual(2018);

	lista.add(v1);
	lista.add(v2);
	lista.add(v3);

	v1.rentar(fr); //renta por 10 dias

	for(Vehiculo v : lista){
		System.out.println(v.toString());
		}
	}
}
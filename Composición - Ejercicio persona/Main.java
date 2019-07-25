import java.util.*;
public class Main
{	public static void main (String[] args)
	{	ArrayList<Persona> a = new ArrayList<Persona>();
		Direccion direccion = new Direccion("45","161","15000","Mexico");
		Fecha fechadefault = new Fecha(02,12,2000);
		Fecha fechaactual = new Fecha(03,04,2018);
		Persona persona1 = new Persona("Sabrina",direccion,fechadefault);
		Persona persona2 = new Persona("Alejandro",direccion,fechadefault);
		Persona persona3 = new Persona("Bpebpe",direccion,fechadefault);
			a.add(persona1);
			a.add(persona2);
			a.add(persona3);
		for(Persona p : a)
		{	System.out.println(p.toString());	}
		for(Persona p : a)
		{	if(p.esMayorDeEdad(fechaactual) == true)
			{	System.out.println(p.toString());	}
		}
	}
}
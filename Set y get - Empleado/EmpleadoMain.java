public class EmpleadoMain
{
	public static void main(String[] args)
	{
		Empleado e1 = new Empleado("Bpebpe","Hernandez","Mirafounts",10005000);
		Empleado e2 = new Empleado("Sabrina","San","L",5397);
		Empleado e3 = new Empleado("Daniel","Leon","Fuentes",1204);
		Empleado e4 = new Empleado();
		Empleado e5 = new Empleado(20000);

		e4.setNombre("Pame");
		e4.setApellidop("Estra");
		e4.setApellidom("Cla");
		e4.setNumemp(3456);
		e5.setNombre("Alex");

		System.out.println(e2.compara(e3));
		System.out.println(e4.compara(e5));
	}
}
/*
C:\Users\User\Documents\ITESM\Segundo Semestre\Progra Objetos\Empleado>java EmpleadoMain
Numero de empleado no valido
Tienen el mismo sueldo
Alex
*/
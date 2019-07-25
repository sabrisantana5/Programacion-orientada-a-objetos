public class MainPersona
{
	public static void main(String[] args)
	{
		Persona cliente1 = new Persona();
		Persona cliente2 = new Persona("Bpebpe");
		Persona cliente3 = new Persona("Sabrina", "Lopez", 19, "Mrs");
		Persona cliente4 = new Persona();
		// error  cliente1.nombre = "";
		cliente2.printPersona();
		cliente3.printPersona();
		cliente4.printPersona();

		cliente1.setNombre("Alex");
		cliente1.setApellido("Diaz");
		cliente1.setEdad(19);
		cliente1.setAlias("Bach");

		cliente1.printPersona();

		int edad = cliente1.getEdad();
		System.out.println(cliente1.getEdad());
	}
}
/*Persona: null. Bpebpe null
Edad: 0
Persona: Mrs. Sabrina Lopez
Edad: 19
Persona: null. null null
Edad: 17
Persona: Bach. Alex Diaz
Edad: 19
19*/
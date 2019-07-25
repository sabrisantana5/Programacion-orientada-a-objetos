import java.util.*;

public class ClienteMain
{
	public static void main(String[] args)
	{
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		Scanner lector = new Scanner(System.in);
		char answer = 'Y';
		int count = 0;

		do
		{
			System.out.println("Por favor introduzca su nombre");
			String name = lector.next();
			System.out.println("Por favor introduzca su apellido");
			String lastname = lector.next();
			System.out.println("Por favor introduzca su edad");
			int age = lector.nextInt();
			System.out.println();

			Cliente client = new Cliente(name,lastname,age);
			System.out.println("Asignar Tarjeta de Crédito:[Y/N]");
			char ans = lector.next().charAt(0);
			System.out.println();
			if(ans == 'Y')
			{
				System.out.print("Por favor indique el numero");
				String number = lector.next();
				System.out.print("Por favor indique el límite de crédito");
				double balance = lector.nextDouble();
				System.out.print("Por favor indique la fecha de expedición[dd mm yyyy]");
				int day = lector.nextInt();
				int month = lector.nextInt();
				int year = lector.nextInt();

				System.out.println("Por favor seleccione el tipo de tarjeta de crédito que desea");
				System.out.println("1. CLASICA");
				System.out.println("2. ORO");
				System.out.println("3. PLATINUM");
				System.out.println("4. BLACK");

				int tipotc = lector.nextInt();

				TarjetaCredito tc = new TarjetaCredito();

				switch(tipotc)
				{
					case 1:
						tc = new TarjetaCredito(number, balance, day, month, year+5,TiposTC.CLASICA);
					break;
					case 2:
						tc = new TarjetaCredito(number, balance, day, month, year+5,TiposTC.ORO);
					break;
					case 3:
						tc = new TarjetaCredito(number, balance, day, month, year+5,TiposTC.PLATINUM);
					break;
					case 4:
						tc = new TarjetaCredito(number, balance, day, month, year+5,TiposTC.BLACK);
					break;
					default:
					System.out.println("Opcion no válida. Tarjeta creada sin tipo de tarjeta");
					tc = new TarjetaCredito(number, balance, day, month, year+5);
					break;
				}
				client.setTarjetaCredito(tc);
			}
			lista.add(client);
			count++;
			System.out.println("¿Deseas agregar un nuevo cliente?[Y/N]");
			 answer = lector.next().charAt(0);
			System.out.println();
		} while(answer=='Y');

		for(int i = 0; i< lista.size();i++)
		{
			if(lista.get(i)!= null)
			lista.get(i).printCliente();
		}
	}
}
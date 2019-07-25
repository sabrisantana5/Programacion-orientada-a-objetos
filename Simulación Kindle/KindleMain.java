import java.util.*;
public class KindleMain
{
 public static void main(String[] args)
	{
		Scanner lector = new Scanner(System.in);
		Kindle k = new Kindle();
		int r;
		System.out.println("Bienvenido a Kindle");
			do
			{
		System.out.printf("Por favor eliga una opcion %n 1.Agregar libro 2.Leer libro 3. Eliminar libro 4. Ver mis libros 5. Ultimo libro 6.Salir%n");
			r = lector.nextInt();
			lector.nextLine();
			switch(r)
			{
			case 1:
			System.out.println("Titulo del libro");
			String titulo = lector.nextLine();
			System.out.println("Autor del libro");
			String autor = lector.nextLine();
			System.out.println("Numero de paginas");
			int nopag  = lector.nextInt();
			lector.nextLine();
				k.AgregaLibros(titulo,autor,nopag);
		    break;
		    case 2:
		    	System.out.println("Por favor indique el titulo del libro que va a leer");
		    	String titl = lector.nextLine();
		   	 	k.LeerLibro(titl);
		    break;
		    case 3:
		    	System.out.println("Por favor indique el titulo del libro que va a eliminar");
		    	String tite = lector.nextLine();
		    	k.EliminaLibros(tite);
		    break;
		    case 4:
		    	k.ImprimeLibros();
		    break;
		    case 5:
		    	k.UltimoLibro();
		    break;
			}
		}while(r!=6);
	}
}
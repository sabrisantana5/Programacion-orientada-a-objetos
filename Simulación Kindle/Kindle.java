import java.util.*;
public class Kindle
{
	public static ArrayList<Libros> biblioPersonal = new ArrayList<Libros>();
	Libros libro;
	public Kindle()
	{
	}
		public void AgregaLibros(String titulo, String autor, int nopag)
		{
			biblioPersonal.add(0,new Libros(titulo,autor,nopag));
			System.out.printf("El libro agregado  es: %s",titulo);
			System.out.println();
		}

		public void LeerLibro(String tit)
		{
			boolean a=false;
			for(Libros lib : biblioPersonal)
			{
				if(tit.equals(lib.getTitulo()))
				{
					System.out.printf("El usuario está leyendo %s %n",tit);
					int id = biblioPersonal.indexOf(lib);
					biblioPersonal.add(0,lib);
					biblioPersonal.remove(id+1);
					a=true;
				}
			}
			if(a==false)
			{
				System.out.println("Libro no existente");
			}
		}

		public void EliminaLibros(String tit)
		{
			int id=0;

			for(Libros lib : biblioPersonal)
			{
				if(tit.equals(lib.getTitulo()))
				{
					id = biblioPersonal.indexOf(lib);
					System.out.printf("El libro eliminado es: %s %n",tit);
				}
			}
			biblioPersonal.remove(id);
		}

		public void ImprimeLibros()
		{
			if(biblioPersonal.size()==0)
			{
				System.out.println("Aun no has agregado libros a tu biblioteca");
			}
			else
			{
			System.out.println("Los libros guardados son: ");
			for(Libros l : biblioPersonal)
			{
				System.out.printf("Nombre: %s Autor: %s Numero de pagina: %d. %n",l.getTitulo(),l.getAutor(),l.getNopag());
			}
			}
		}
		public void UltimoLibro()
		{
			System.out.print("El ultimo libro leido o agregado es: "+ (biblioPersonal.get(0)).getTitulo()+"\n");
		}


}
//clase padre cpon caracteres iguales de revista y libros, de ahi heredan
//agregar un objeto de una clase al main, agregacion
//composicion, dentro del constructor de kindle crea un libro de otra clase y pone kindle.add(book),ya que si en el main desapareces kindle se pierde
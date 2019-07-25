//programa que dice si dos canguros a diferentes velocidades y posiciones se encuentran despues de varios saltos.
import java.util.Scanner;
public class CangurosMain
{
		public static void main(String[]args)
	{
		Scanner lector = new Scanner(System.in);
		int x1,v1,x2,v2;

		System.out.println("Introduce en el sig orden x1 v1 x2 v2 las variables de tus dos canguros");
		x1 = lector.nextInt();
		v1 = lector.nextInt();
		x2 = lector.nextInt();
		v2 = lector.nextInt();

		Canguros canguro1 = new Canguros();
		Canguros canguro2 = new Canguros();

		canguro1.setx(x1);
		canguro1.setv(v1);
		canguro2.setx(x2);
		canguro2.setv(v2);

		canguro1.Compara(canguro2);

	}
}

/*
Introduce en el sig orden x1 v1 x2 v2 las variables de tus dos canguros
Intput: 1 2 3 4
Output: No
Introduce en el sig orden x1 v1 x2 v2 las variables de tus dos canguros
Input: 0 3 4 2
Output: Si

*/

//metodo pop elimina el ultimo numero del arreglo, lo hace 0 y así hasta el primer numero
//push vas metiendo elementos y va recorriendo  y pasando por todas las posiciones y cuando ya no caben el ultimo se elimina y se siguen recorrdiendo.

import java.util.Arrays;
import java.util.Scanner;

public class Filas2
{
	public static void main(String[] args)
	{
		int[] a = {2, 3};
		cambiar(a);
		System.out.println(Arrays.toString(a));
	}
	public static int cambiar(int[] a)
	{
		a[0] = 4;
		return a[0];
	}
}
//[4,3]
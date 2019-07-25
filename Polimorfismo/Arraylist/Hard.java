import java.util.*;
public class Hard
{
	public static int buscaints(int a,Integer[] array, int max)
	{
		if(a<0)
			{
				return max;
			}
		else if(array[a] > max)
			{
				max = array[a];
				return buscaints(a-1,array,max);
			}
		else
			{
				return buscaints(a-1,array,max);
			}
	}
}
//abstract, nadie puede instanciar esta clase
//constructores no pueden ser abstract
//metodos estaticos no pueden ser abstractos
//clase abstract solo metodos abstactos no de otro tipo
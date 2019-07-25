public class Subarreglo
{
	public static void main(String[] args)
	{
	int[] arreglo = {1,-2,4,-5,1};
	calculo(arreglo);
	int[] arreglo2 = {1,2,3};
	calculo(arreglo2);
	int[] arreglo3 = {1,-4,2};
	calculo(arreglo3);
	int[] arreglo4 = {1,2,3,-5};
	calculo(arreglo4);
	}
	public static void calculo(int[] arreglo)
	{
		int contador = 0;
		int j=0;

		for(int i = 0;i<arreglo.length;i++)
		{
			if(arreglo[i]<0)
				{
				contador+=1;
				}
		}
		for(int i = 0;i<arreglo.length-1;i++)
		{
			if (arreglo[i]+arreglo[i+1]<0)
			{
				contador+=1;
			}
		}
		for(int i = 0;i<arreglo.length;i++)
		{
				while(j<arreglo.length)
						{
						arreglo[i]+=arreglo[i+1];
						if(arreglo[i]<0)
							{
								contador+=1;
							}
							j++;
						}
		}
		System.out.println(contador);
	}
}

/*
C:\Users\User\Documents\ITESM\Segundo Semestre\Progra Objetos\Empleado>java Subarreglo
10
0
6
2
*/
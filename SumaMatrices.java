import java.util.Arrays;

public class SumaMatrices
{
	public static void main(String [] args)

	{
		int[][] matriz1 = {{2,10,21},{4,3,9},{8,7,6}}; //70
		int[][] matriz2 = {{2,2,2},{2,2,2},{2,2,2}}; //18
		int[][] matriz3 = {{2,2},{2,2},{2,2}}; //12
		int i,j;
		System.out.printf("La suma de la matriz 1 = %d %n",SumaRecursiva(matriz1,i=matriz1.length-1,j=matriz1[0].length-1));
		System.out.printf("La suma de la matriz 2 = %d %n",SumaRecursiva(matriz2,i=matriz2.length-1,j=matriz2[0].length-1));
		System.out.printf("La suma de la matriz 3 = %d %n",SumaRecursiva(matriz3,i=matriz3.length-1,j=matriz3[0].length-1));
	}

	public static int SumaRecursiva(int[][] matriz,int i, int j)
	{
		int suma=0;

		if((i == 0)&&(j==0))
		{
			suma += matriz[i][j];
			return suma;
		}
		else if (j==-1)
		{
			i=i-1;
			j=matriz[0].length-1;
		}

		return suma+= matriz[i][j] + SumaRecursiva(matriz,i,j-1);
	}
}
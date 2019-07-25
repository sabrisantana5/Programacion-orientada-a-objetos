import java.util.Arrays;
import java.util.Scanner;

public class SopaLetras
{
	public static void main(String[] args)
	{
		String[][] array1 = {{"G","J","E","L","O","S"},{"E","G","E","E","K","S"},{"E","I","W","X","H","Q"},{"K","M","D","G","W","A"},{"S","S","K","E","E","G"},{"R","F","H","K","W","L"}};
		String palabra1 ="GEEKS";
		System.out.println("Este programa indica la cantidad de veces que una palabra se repite en una sopa de letras de 6 renglones y 6 columnas");
		System.out.printf("La palabra %s se encuentra %s veces en la sopa",palabra1,camount(palabra1, array1));

	}
	public static String camount(String palabra, String[][] a)
	{
				for (int i=0; i<a.length;i++)
				{
					for(int j=0;j<a[0].length;j++)
					{
						System.out.printf("%s  ",a[i][j]);
					}
					System.out.println();
				}

		String temp1 = a[0][0] + a[0][1] + a[0][2] + a[0][3] + a[0][4] + a[0][5];
		String temp2 = a[0][0] + a[1][0] + a[2][0] + a[3][0] + a[4][0] + a[5][0];
		int amount = 0;
		String palabraAlreves ="";
		String result = "";
				for(int i = palabra.length()-1; i>=0; i--)
				{
				palabraAlreves += palabra.charAt(i);
		        }

		for(int i=0;i < a.length;i++)
		{
			for(int j = 0;j < a.length-5;j++)
			{
				temp1 = a[i][j] + a[i][j+1] + a[i][j+2] + a[i][j+3] + a[i][j+4] + a[i][j+5];
				temp2 = a[j][i] + a[j+1][i] + a[j+2][i] + a[j+3][i] + a[j+4][i] + a[j+5][i];

				if(temp1.contains(palabra)||temp1.contains(palabraAlreves)||temp2.contains(palabra)||temp2.contains(palabraAlreves))
				amount++;
			}
		}
		result = Integer.toString(amount);
		return result;
	}
}
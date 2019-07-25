
//no se puede poner 0 en la fila
import java.util.Arrays;
import java.util.Scanner;

public class Filas
{
	static int[] fila = new int[3]; //variable global

	public static void main(String[] args)
	{
		push2(2);
		print();
		push2(3);
		print();
		push2(4);
		print();
		push2(10);
		print();
		pop();
		print();
		pop();
		print();
		pop();
		print();
	}
	public static void push2(int a)
	{
		for(int i = fila.length-1;i > 0;i--)
		{
			fila[i] = fila[i-1];
		}
		fila[0] = a;
	}

	public static void push(int a)
	{
		int i = fila.length-1;
		while (i-1>-1)
		{
			fila[i] = fila[i-1];
			i -= 1;
		}
		fila[0] = a;
	}

	public static void pop()
	{
		    int i = fila.length-1;
			while (fila[i] == 0)
			{
			i--;
			}
				fila[i] = 0;
	}

	public static void print()
	{
		System.out.println(Arrays.toString(fila));
	}
}

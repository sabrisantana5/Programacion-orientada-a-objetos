import java.util.Arrays;

public Popush
{
	static int[] arreglo = new int[5];

	public static void main(String[] args)
	{
	}
	public static void push(int a)
	{
		for(int i=arreglo.length-1;i=0;i--)
		{
			arreglo[i] = arreglo[i-1];
		}
		arreglo[0] = a;
	}
	public static void pop()
	{
		int i = arreglo.length-1;
		while(i!= 0)
		{
		i--;
		}
		arreglo[i] = 0;
	}
	public static void imprime()
	{
		System.out.println(Arrays.toString(arreglo));
	}
}
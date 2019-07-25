import java.util.Scanner;

public class Euclidiano
{ public static void main (String[] args)
	{
		int p,q;
		Scanner lector = new Scanner(System.in);
		System.out.println("Esta aplicacion saca el gcd de dos numeros enteros");
		System.out.println("Dame la p");
		p = lector.nextInt();
		System.out.println("Dame la q");
		q = lector.nextInt();
		if(p>=q)
		System.out.printf("El gcd es: %d ",gcd(p,q));
		else
		System.out.println("p debe ser mayor o igual a q");
	}
	public static int gcd(int p, int q )
	{
		if(q==0)
		return p;

		else
		return gcd(q,p%q);
	}
}
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraFracciones
{
	public static void main(String[] args)
	{
		Scanner lector = new Scanner(System.in);
		int r;
		String s = "Soy un String";
		Fraccion otro = new Fraccion();
		System.out.println("Bienvenido. Este programa realiza operaciones básicas entre fracciones :)");
		do
		{
		System.out.println("Por favor escoja una opcion (1)SUMAR (2)RESTAR (3) MULTIPLICAR (4) DIVIDIR (5) IGUALDAD (6) SIMPLIFICAR (7)PASAR A DECIMAL (8) SALIR");
		 r = lector.nextInt();

		if ((r>=5)&&(r<=7))
		{
			try
			{
			System.out.println("Introduce numerador entero y denominador entero de la fraccion:");
			int n1 = lector.nextInt();
			int d1 = lector.nextInt();
			Fraccion f1 = new Fraccion(n1,d1);
			if(r==5)
			{
			System.out.println("La fraccion comparada con la fraccion 0/1:");
			f1.equals(otro);
			System.out.printf("La fraccion comparada con el String %s: %n",s);
			f1.equals(s);
			}
			if(r==6)
			System.out.printf("La fraccion simplificada es: %s %n",f1.toLowestTerms());
			if(r==7)
			System.out.printf("La fraccion con decimales es: %f %n",f1.toDouble());
			}
			catch(InputMismatchException ex)
			{
				System.err.printf("Excepción: %s %n",ex);
				System.out.println("Ingreso no válido");
				lector.nextLine();
			}
			catch(ArithmeticException ae)
			{
				System.err.printf("Excepción: %s %n",ae);
				lector.nextLine();
			}
		}
		else if ((r>=1)&&(r<=4))
		{
			try
			{
			System.out.println("Introduce numerador entero y denominador entero de la primer fraccion:");
			int n1 = lector.nextInt();
			int d1 = lector.nextInt();
			Fraccion f1 = new Fraccion(n1,d1);
			System.out.println("Introduce numerador entero y denominador entero de la segunda fraccion:");
			int n2 = lector.nextInt();
			int d2 = lector.nextInt();
			Fraccion f2 = new Fraccion(n2,d2);

		switch (r)
			{
			case 1:
			System.out.println("La suma de fracciones es:"+f1.add(f2));
			break;

			case 2:
			System.out.println("La resta de fracciones es:"+f1.substract(f2));
			break;

			case 3:
			System.out.println("La multiplicacion de fracciones es:"+f1.multiply(f2));
			break;

			case 4:
			try
				{
			System.out.println("La division de fracciones es:"+f1.divide(f2));
				}
			catch(ArithmeticException ex)
				{
				System.err.printf("Excepción: %s",ex);
				System.out.println("El denominador no puede ser 0");
				}
			break;
			}
			}
			catch(InputMismatchException ex)
				{
				System.err.printf("Excepción: %s %n",ex);
				System.out.println("Ingreso no válido");
				lector.nextLine();
				}
			catch(ArithmeticException ae)
				{
				System.err.printf("Excepción: %s %n",ae);
				lector.nextLine();
				}
		}

		} while(r!=8);

	}
}
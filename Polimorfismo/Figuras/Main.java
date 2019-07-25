import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CREANDO UN CIRCULO");
        System.out.print("Introduce el r�dio: ");
        double radio = input.nextDouble();
        System.out.print("Introduce el color: ");
        String color = input.next();

        Figura figura = new Circulo(color, radio);
        System.out.println("El �rea del c�rculo es: " + figura.area());
        System.out.println("El per�metro del c�rculo es: " + figura.perimetro());
        System.out.println("El color del c�rculo es: " + figura.getColor());

        System.out.println("CREANDO UN CUADRADO"); //con class rectangulo
        System.out.print("Introduce el lado del cuadrado: ");
        double lado = input.nextDouble();
        System.out.print("Introduce el color: ");
        color = input.next();

        figura = new Rectangulo(color, lado, lado);
        System.out.println("El �rea del cuadrado es: " + figura.area());
        System.out.println("El per�metro del cuadrado es: " + figura.perimetro());
        System.out.println("El color del cuadrado es: " + figura.getColor());

    }
}
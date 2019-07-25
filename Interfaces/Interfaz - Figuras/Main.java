import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CREANDO UN CIRCULO");
        System.out.print("Introduce el r�dio: ");
        double radio = input.nextDouble();
        Figura figura = new Circulo(radio);
        System.out.println("El �rea del c�rculo es: " + figura.area());
        System.out.println("El per�metro del c�rculo es: " + figura.perimetro());
        System.out.println("El color del c�rculo es: " + figura.color);
        System.out.println("CREANDO UN CUADRADO"); //con class rectangulo
        System.out.print("Introduce el lado del cuadrado: ");
        double lado = input.nextDouble();
        figura = new Cuadrado(lado);
        System.out.println("El �rea del cuadrado es: " + figura.area());
        System.out.println("El per�metro del cuadrado es: " + figura.perimetro());
        System.out.println("El color del cuadrado es: " + figura.color);

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CREANDO UN CIRCULO");
        System.out.print("Introduce el rádio: ");
        double radio = input.nextDouble();
        Figura figura = new Circulo(radio);
        System.out.println("El área del círculo es: " + figura.area());
        System.out.println("El perímetro del círculo es: " + figura.perimetro());
        System.out.println("El color del círculo es: " + figura.color);
        System.out.println("CREANDO UN CUADRADO"); //con class rectangulo
        System.out.print("Introduce el lado del cuadrado: ");
        double lado = input.nextDouble();
        figura = new Cuadrado(lado);
        System.out.println("El área del cuadrado es: " + figura.area());
        System.out.println("El perímetro del cuadrado es: " + figura.perimetro());
        System.out.println("El color del cuadrado es: " + figura.color);

    }
}
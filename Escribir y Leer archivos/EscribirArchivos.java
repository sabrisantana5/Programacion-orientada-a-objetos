/*
 Programa que escribe datos en un archivo de texto.
 */
import java.io.*;
import java.util.Scanner;

public class EscribirArchivos
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        FileWriter fichero = null; /*FileWriter es una clase para escribir archivos de caracteres.
        Los constructores de esta clase asumen la codificaci�n de caracteres predeterminada y el tama�o del buffer predeterminado.
        FileWriter fue desarrollado para escribir secuencias de caracteres. Para escribir flujos de bytes sin formato, se debe usar FileOutputStream.
        Dentro de esta clase podemos encontrar el m�todo write(); sin embargo, en este ejemplo es m�s conveniente usar la clase PrintWriter
        que hereda de la clase Writer para imprimir texto en el archivo. */
        PrintWriter pw = null; /*PrintWriter es una clase para imprimir representaciones con formato de objetos en una secuencia de salida de texto.
        Esta clase implementa todos los m�todos de impresi�n encontrados en PrintStream que se cre� para escribir bytes sin procesar.
        En este ejemplo usaremos el m�todo printf() para escribir en el archivo abierto por el FileWriter. */

        //Cuando abrimos un archivo es necesario hacerlo dentro de un try/catch debido que puede que exista errores al intentar abrir un archivo.

        try
        {
            fichero = new FileWriter("Salida.txt");
            pw = new PrintWriter(fichero, true);

            pw.printf("%s\t%s\t\n", "C�digo ", "Producto");
            //pw.printf("%d\t%s\t\n", barras, producto);

            for (int i = 0; i < 3; i++){
                System.out.print("Introduce el c�digo de barras: ");
                int barras = input.nextInt();
                input.nextLine();
                System.out.print("Introduce el art�culo: ");
                String producto = input.nextLine();
                pw.printf("%d\t%s\t\n", barras, producto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para asegurar que se cierra el fichero
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

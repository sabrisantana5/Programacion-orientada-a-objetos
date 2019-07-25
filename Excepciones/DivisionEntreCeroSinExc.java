/*
- Una excepción es un problema que surge durante la ejecución de un programa.
- El flujo normal del programa se altera y la aplicación termina de forma anormal. (no recomendado)
 
 Una excepción puede ocurrir por diferentes razones:
 1. Datos inválidos de entrada.
 2. Un archivo que necesita abrirse no se encuentra.
 
 Algunas excepciones son causadas por el usuario, otras por el programador. Derivado de ese motivo, existen dos principales categorías de excepciones:
 
 a) Excepciones verificadas. Una excepción verificada es una excepción que ocurre en tiempo de compilación (excepciones en tiempo de compilación).
 
    EJEMPLO: Uso de la clase FileReader que lee datos de un archivo. Si el archivo específicado en el constructor no existe, una excepción "FileNotFoundException" ocurre.
 
 
 b) Excepciones no verificadas. Una excepción no verificada es una excepción que ocurre en el momento de la ejecución (excepciones de tiempo de ejecución). Incluyen errores de programación: errores de lógica o uso incorrecto de la aplicación. Estas excepciones se ignoran al momento de la compilación.
 
    EJEMPLO: Si intentas acceder a un espacio de un arreglo que no fue reservado, ocurre una excepción "ArrayIndexOutOfBoundsExceptionexception".
 
 Un método "cacha" una excepción utilizando las palabras reservadas try/catch. Se coloca un bloque try/catch dentro del código que podría generar una excepción. 
 
 Sintaxis:
 try {
    // Protected code
 } catch (ExceptionName e1) {
    // Catch block
 }
 
 Un bloque try puede ir seguido de muchos catch.
 
 Sintaxis:
 try {
    // Protected code
 } catch (ExceptionType1 e1) {
    // Catch block
 } catch (ExceptionType2 e2) {
    // Catch block
 } catch (ExceptionType3 e3) {
    // Catch block
 }
 
 */


import java.util.Scanner;

public class DivisionEntreCeroSinExc{
    public static int cociente(int numerador, int denominador){
        return numerador / denominador;
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca un numerador entero: ");
        int numerador = entrada.nextInt();
        System.out.print("Introduzca un denominador entero: ");
        int denominador = entrada.nextInt();
        
        int resultado = cociente(numerador, denominador);
        System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
    }
}

/* EJEMPLO 1 - SALIDA:
 Introduzca un numerador entero: 100
 Introduzca un denominador entero: 7
 
 Resultado: 100 / 7 = 14
 */

/* EJEMPLO 2 - SALIDA:
 Introduzca un numerador entero: 100
 Introduzca un denominador entero: 0
 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at DivisionEntreCeroSinExc.cociente(DivisionEntreCeroSinExc.java:5)
	at DivisionEntreCeroSinExc.main(DivisionEntreCeroSinExc.java:16)
 */

/* EJEMPLO 3 - SALIDA:
 Introduzca un numerador entero: 100
 Introduzca un denominador entero: Hola
 Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at DivisionEntreCeroSinExc.main(DivisionEntreCeroSinExc.java:14)
 */

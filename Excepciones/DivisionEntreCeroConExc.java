import java.io.*;

public class DivisionEntreCeroConExc{
    
    public static void cociente(int numerador, int denominador) throws FileNotFoundException{
        
        //La palabra reservada throw nos sirve para lanzar una excepci�n en cualquier bloque de c�digo de nuestro programa
        
        if (denominador == 10)
            throw new FileNotFoundException("File no exists");
        //int resultado = numerador/denominador;
    }
    
    public static void main(String[] args){
        cociente(1, 10);
        System.out.println("hola");
    }
}
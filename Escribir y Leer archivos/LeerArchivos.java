/*Programa que lee los datos de un archivo de texto y cada línea leída la almacena en un ArrayList*/
import java.io.*;
import java.util.ArrayList;
class LeerArchivos {
    public static void main(String [] arg) {
        //Las siguientes tres líneas son necesarias para poder leer un archivo
        File archivo = null; //Declarar una variable de tipo File
        FileReader fr = null; //Declarar una variable de tipo FileReader
        BufferedReader br = null; //Declarar una variable de tipo BufferedReader
        ArrayList<String> registros = new ArrayList<>();
        //Necesario el uso de try/catch para abrir un archivo, debido a que puede haber errores al intentar abrir el archivo
        try {
            // Apertura del archivo y creacion de BufferedReader para poder hacer una lectura (uso del método readLine()).
            archivo = new File ("Salida.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            // Lectura del archivo
            String linea;
            while((linea=br.readLine())!=null){
                registros.add(linea);
            }
            for(int j = 0; j < registros.size(); j++)
                System.out.println(registros.get(j));
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            // En el finally cerramos el archivo
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
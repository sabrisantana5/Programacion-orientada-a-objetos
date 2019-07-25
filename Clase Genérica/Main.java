public class Main{
	public static void main(String[] args){
		//Creamos una instancia de ClaseGenerica para Integer
		ClaseGenerica<Character, String> intObj = new ClaseGenerica<Character, String>('a',"Hola");
		intObj.classType();

		//Creamos una instancia de ClaseGenerica para Integer
		//ClaseGenerica<String> strObj = new ClaseGenerica<String>("Hola");
		//strObj.classType();
	}
}

//interfaces no tienen constructores
//si la clase es abstracta puede tener constructor pero solo para sus hijos
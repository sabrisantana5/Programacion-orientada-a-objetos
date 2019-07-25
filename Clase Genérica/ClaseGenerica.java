/*
Declaracion de una clase generica
*/
public class ClaseGenerica<T1, T2>{ //puedes poner la variable que quieras
	T1 obj1; //declarar variable de tipo T
	T2 obj2;

	public ClaseGenerica(T1 o1, T2 o2){ //si no pones constructor tienes automaticamente null
			obj1 = o1;
			obj2 = o2;
		}

	public void classType() {
		System.out.println("El tipo de T es: " + obj1.getClass().getSimpleName() + " y el valor es: " + obj1);
		System.out.println("El tipo de T es: " + obj2.getClass().getSimpleName() + " y el valor es: " + obj2);
		//getsimple name te da el nombre de la clase
	}

	//public T nombreMetodo(T )
	public T1 getObj1(){return obj1;}
}
/*
Los generics permiten usar tipos para parametrizar las clases, interfaces y métodos al definirlas.

T es el tipo genérico que será remplazado por un tipo real.
T es el nombre que damos al parámetro genérico.
Este nombre se sustituirá por el tipo real que se le pasará a la clase.

Las clases genericas de java solo funcionan con objetos
*/

//Cuando una clase en Java implementa la interfaz Comparable, los objetos de esa clase pueden ser ordenados automaticamente usando los metodos: Collections.sort o Arrays.sort La colección será ordenada con base en el orden definido en el método compareTo
import java.util.Collections;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101,"Vijay",23));
		al.add(new Student(106,"Ajay",27));
		al.add(new Student(105,"Jay",21));

		Collections.sort(al);
		/* for(int i=0; i<al.size();i++)
		{	System.out.println(al.get(i).rollno+" "+al.get(i).name+" "+al.get(i).age);	} */
		// Otra forma de obtener el id de un elemento en una lista es: for(Object obj:o)
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}
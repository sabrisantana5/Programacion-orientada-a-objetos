//Java provee la interfaz Comparable, la cual contiene solo un método, compareTo(). Este metodo compara dos objetos para lograr un orden entre ellos. Este metodo regresa un entero que puede ser negativo, cero o positivo, para indicar que el objeto de entrada es menor, igual o mayor al objeto existente.
public class Student implements Comparable<Student>
{	public int rollno;
	public String name;
	public int age;
	public Student(int rollno, String name, int age)
	{	this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student st)
	{	if(age==st.age)
			return 0;
		else if(age>st.age)
			return -1;
		else
			return 1;
	}
}
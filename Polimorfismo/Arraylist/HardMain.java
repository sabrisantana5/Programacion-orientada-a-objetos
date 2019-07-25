import java.util.ArrayList;
public class HardMain
{	public static void main(String[] args)
	{	int max = 0; //{{1,2,3},{4,5,6,{20,22}},7,8,9}
		ArrayList<Object> lista = new ArrayList<Object>();
		ArrayList<Object> lista1 = new ArrayList<Object>();
		ArrayList<Object> lista2 = new ArrayList<Object>();
		ArrayList<Object> lista3 = new ArrayList<Object>();
		lista3.add(20);
		lista3.add(22);
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista2.add(4);
		lista2.add(5);
		lista2.add(6);
		lista2.add(lista3);
		lista.add(lista1);
		lista.add(lista2);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		int a = lista.size();
		System.out.println("El numero maximo en la lista es: "+busca(a-1,lista,max));
	}
		@SuppressWarnings("unchecked")
		public static int busca(int a,ArrayList<Object> lista,int max){
			if(a<0){	return max;		}
			else{	if((lista.get(a)).getClass() == Integer.class){
					int m;
					m = (int)lista.get(a);
					if(m > max){  	max = m;	}
				}
			else{	ArrayList<Object> adentro;
					adentro = (ArrayList<Object>) lista.get(a);
					int b = adentro.size()-1;
					int temp = busca(b,adentro,max);
					if(temp > max)
						max = temp;
				}
				return busca(a-1,lista,max);
			}
		}
}

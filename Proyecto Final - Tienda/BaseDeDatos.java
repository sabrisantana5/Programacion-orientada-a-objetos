import java.util.ArrayList;
public class BaseDeDatos{

	//Variables de Instancia
	protected ArrayList<Objeto> lista = new ArrayList<Objeto>();

	//Otros metodos
	public int getSize(){
		return lista.size();
	}

	public ArrayList<Objeto> getLista(){
		return lista;
	}

	public Objeto buscar(String s){
		for(Objeto objeto : lista){
			if(objeto.getNombre().equals(s)){
      	return objeto;
			}
    }
		return null;
	}

	public void imprime(int item){
		System.out.println(lista.get(item).getNombre());
	}

	public String imprimeTodo(){
    return lista.toString();
  }

	public boolean noExiste(Objeto other){
		for(Objeto o : lista){
			if(o.compararNombre(other)){
				return false;
			}
		}
		return true;
	}

	public void agregar(Objeto objeto){
		lista.add(objeto);
	}

	public void modificar(Objeto viejo, Objeto nuevo){
		lista.set(lista.indexOf(viejo), nuevo);
	}

	public void eliminar(Objeto objeto){
		lista.remove(objeto);
	}

	public void limpiar(){
		lista.clear();
	}
}

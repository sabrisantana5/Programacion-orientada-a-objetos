public class Objeto{

  //Variables de Instancia
  protected String nombre;
	//Constructor
  public Objeto(String nombre){
    this.nombre = nombre;
  }
	//Metodo
  public String getNombre(){
    return nombre;
  }

  public boolean compararNombre(Objeto o){
    if(nombre.equals(o.nombre)){
      return true;
    }
    return false;
  }

}

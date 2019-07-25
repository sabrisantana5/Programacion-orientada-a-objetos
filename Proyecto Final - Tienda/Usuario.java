public class Usuario extends Objeto{

	//variables de instancia
  private String contrasena;
  private TipoDeUsuario tipoDeUsuario;

	//constructor
  public Usuario(String nombre, String contrasena, TipoDeUsuario tipoDeUsuario){
    super(nombre);
    this.contrasena = contrasena;
    this.tipoDeUsuario = tipoDeUsuario;
  }
	//metodos
  public boolean tipoCorrecto(int tipo){
    switch(tipo){
      case 1:
        return(tipoDeUsuario == TipoDeUsuario.ADMINISTRADOR_DE_INVENTARIO);
      case 2:
      case 4:
        return(tipoDeUsuario == TipoDeUsuario.VENDEDOR);
      case 3:
        return(tipoDeUsuario == TipoDeUsuario.ADMINISTRADOR_DE_USUARIOS);
      case 5:
        return true;
      default:
        return false;
    }
  }

  public boolean contrasenaCorrecta(String contrasena){
    if(this.contrasena.equals(contrasena)){
      return true;
    }
    return false;
  }

  public String toString(){
    return nombre + " es un " + tipoDeUsuario;
  }
}

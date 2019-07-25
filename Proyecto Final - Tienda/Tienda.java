/*
		Tecnológico de Monterrey
		Programación Orientada a Objetos
		Profesor: Karen García
		Autores:
		SABRINA SANTANA
		OCTAVIO GARDUZA
		MEGUMI KIMURA
		CRISTOPHER CEJUDO
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.InputMismatchException;
public class Tienda{
	//main
  public static void main(String[] args){
    Inventario inventario = new Inventario();
    BaseDeDatos usuarios = new BaseDeDatos();
    Inventario carrito = new Inventario();
    Scanner lectura = new Scanner(System.in);
    int opcion;

    Usuario admin1 = new Usuario("Default","0000", TipoDeUsuario.ADMINISTRADOR_DE_USUARIOS);
    usuarios.agregar(admin1);

    Usuario adminInv = new Usuario("adminInv","0000", TipoDeUsuario.ADMINISTRADOR_DE_INVENTARIO);
    usuarios.agregar(adminInv);

    Usuario vendedor = new Usuario("vendedor","0000", TipoDeUsuario.VENDEDOR);
    usuarios.agregar(vendedor);

    while(true){
      try{
        System.out.println("Bienvenido a la tiendita, selecciona una opcion:");
        System.out.println("1. Administrar inventario | 2. Vender | 3. Administrar usuarios | 4. Carrito | 5. Ver Nómina | 6. Salir ");
        System.out.println("El inventario es: " + inventario.imprimeTodo());
        opcion = lectura.nextInt();
        if(opcion == 6){
          System.exit(0);
        }
        concederAcceso(opcion, usuarios, inventario, carrito);
      }catch(InputMismatchException ex){
			 System.err.printf("Excepción: %s %n",ex);
			 System.out.println("Ingreso no válido");
				 opcion = -1;
			}
   }
 }

	//metodo menu
  public static void menu(int opcion, BaseDeDatos usuarios, Inventario inventario, Inventario carrito){
    Scanner lectura = new Scanner(System.in);
    switch(opcion){
        case 1:

          while(opcion != 4){
            System.out.println("|ADMINISTRAR INVENTARIO|");
            System.out.println("1. Agregar Producto | 2. Modificar Producto | 3. Eliminar Producto | 4. Salir");
            opcion = lectura.nextInt();
            administrarInventario(opcion, inventario);
          }
          break;
        case 2:
          System.out.println("|VENTA DE PRODUCTOS|");
          do{
            venderProducto(inventario, carrito);
            System.out.println("¿Deseas vender otro producto? [1. Sí | 2. No]");
            opcion = lectura.nextInt();
          }while(opcion == 1);
          break;
        case 3:
          while(opcion != 4){
            System.out.println("|ADMINISTRAR USUARIOS|");
            System.out.println("1. Agregar Usuario | 2. Modificar Usuario | 3. Eliminar usuario | 4. Salir");
            opcion = lectura.nextInt();
            administrarUsuarios(opcion, usuarios);
          }
          break;
        case 4:
          System.out.println("|CARRITO|");
          revisarTicket(carrito);
          System.out.println("¿Deseas finalizar la compra? [1. Sí | 2. No | 3. Cancelar compra]");
          opcion = lectura.nextInt();
          administarCompra(opcion, inventario, carrito);
          break;
        case 5:
          System.out.println("|NÓMINA|");
          System.out.println(usuarios.imprimeTodo());
          break;
        default:
          System.out.println("No existe esta opción");
          break;
    }
  }
	//otros metodos
  public static void concederAcceso(int opcion, BaseDeDatos usuarios, Inventario inventario, Inventario carrito){
    Usuario usuario = logIn(usuarios);
    if (usuario != null){
      if(usuario.tipoCorrecto(opcion)){
        menu(opcion, usuarios, inventario, carrito);
      }
      else{
        System.out.println("Usted no tiene permiso para acceder a esta sección");
      }
    }
  }


  public static Usuario logIn(BaseDeDatos usuarios){
    Scanner lectura = new Scanner(System.in);
    String nombre;
    String contrasena;
    Usuario usuario = null;

    System.out.println("Escribe tu usuario: ");
    nombre = lectura.nextLine();
    usuario = (Usuario)usuarios.buscar(nombre);

    try{
      do{
        System.out.println("Escribe tu contrasena: ");
        contrasena = lectura.nextLine();
      }while(!usuario.contrasenaCorrecta(contrasena));
    }catch(NullPointerException e){
      System.out.println("No se encontro al usuario");
    }

    return usuario;
  }

  public static void administrarUsuarios(int opcion, BaseDeDatos usuarios){
    switch(opcion){
      case 1:
        agregarUsuario(usuarios);
        break;
      case 2:
        modificarUsuario(usuarios);
        break;
      case 3:
        eliminarUsuario(usuarios);
        break;
      case 4:
        System.out.println("Salir");
      default:
        break;
    }
  }

  public static Usuario crearUsuario(){
    Scanner lectura = new Scanner(System.in);
    String nombre;
    String contrasena;
    int tipo;
    Usuario usuario = null;

    System.out.println("AGREGAR USUARIOS");
    System.out.println("Ingrese el nombre del usuario: ");
    nombre = lectura.nextLine();
    System.out.println("Ingrese la contrasena del usuario: ");
    contrasena = lectura.nextLine();
    System.out.println("Ingrese el tipo de usuario:");
    System.out.println("1. Administrador de Inventario | 2. Vendedor | 3. Administrador de usuarios:");
    tipo = lectura.nextInt();
    System.out.println("Operacion exitosa");

    return definirTipoDeUsuario(nombre, contrasena, tipo);
  }

  public static Usuario definirTipoDeUsuario(String nombre, String contrasena, int tipo){
    switch(tipo){
      case 1:
        return new Usuario(nombre, contrasena, TipoDeUsuario.ADMINISTRADOR_DE_INVENTARIO);
      case 2:
        return new Usuario(nombre, contrasena, TipoDeUsuario.VENDEDOR);
      case 3:
        return new Usuario(nombre, contrasena, TipoDeUsuario.ADMINISTRADOR_DE_USUARIOS);
      default:
        return null;
    }
  }

  public static Usuario buscarUsuario(BaseDeDatos usuarios){
    Scanner lectura = new Scanner(System.in);
    String nombre;
    Usuario usuario;
    System.out.println("Escribe el nombre del usuario a buscar: ");
    nombre = lectura.nextLine();
    return (Usuario) usuarios.buscar(nombre);
  }

  public static void agregarUsuario(BaseDeDatos usuarios){
    Usuario u = crearUsuario();
    if(usuarios.noExiste(u)){
      usuarios.agregar(u);
    }
    else{
      System.out.println("El usuario ya existe, favor de agregar uno diferente");
    }
  }

  public static void modificarUsuario(BaseDeDatos usuarios){
    Usuario u = buscarUsuario(usuarios);
    if(u != null){
      usuarios.modificar(u, crearUsuario());
    }
    else{
      System.out.println("El usuario que busca no se pudo encontrar");
    }
  }

  public static void eliminarUsuario(BaseDeDatos usuarios){
    Usuario u = buscarUsuario(usuarios);
    if(u != null && !u.getNombre().equals("Default")){
      System.out.println("Se ha eliminado exitosamente al usuario");
      usuarios.eliminar(u);
    }
    else{
      System.out.println("No se pudo eliminar al usuario");
    }
  }

  public static void administrarInventario(int opcion, Inventario inventario){
    switch(opcion){
      case 1:
        agregarProducto(inventario);
        break;
      case 2:
        modificarProducto(inventario);
        break;
      case 3:
        eliminarProducto(inventario);
        break;
      case 4:
        System.out.println("Salir");
        break;
      default:
        System.out.println("Opción no valida");
        break;
    }
  }

  public static Producto crearProducto(){
    Scanner lectura = new Scanner(System.in);
    int categoria;
    String codigoDeBarras;
    String nombre;
    int cantidad;
    double precio;


    System.out.println("Bebida o Alimento: ");
    System.out.println("1. Bebida | 2. Alimento");
    categoria = lectura.nextInt();

    lectura.nextLine();

    System.out.println("Introduce el código de barras: ");
    codigoDeBarras = lectura.nextLine();

    System.out.println("Nombre del producto: ");
    nombre = lectura.nextLine();

    System.out.println("Cantidad: ");
    cantidad = lectura.nextInt();

    System.out.println("Costo Unitario: ");
    precio = lectura.nextDouble();

    System.out.println("Operación exitosa");

    if(categoria == 1){
      return new Producto(nombre, codigoDeBarras, cantidad, precio, TipoDeProducto.BEBIDA);
    }
    else{
      return new Producto(nombre, codigoDeBarras, cantidad, precio, TipoDeProducto.ALIMENTO);
    }
  }

  public static Producto buscarProducto(Inventario inventario){
    Scanner lectura = new Scanner(System.in);
    String nombre;
    Producto producto;
    System.out.println("Escribe el nombre o el codigo de barras del producto que buscas: ");
    nombre = lectura.nextLine();
    return (Producto) inventario.buscar(nombre);
  }

  public static void agregarProducto(Inventario inventario){
    inventario.agregar(crearProducto());
  }

  public static void modificarProducto(Inventario inventario){
    Producto p = buscarProducto(inventario);
    if(p != null){
		System.out.println("MODIFICAR");
      inventario.modificar(p, crearProducto());
    }
    else{
      System.out.println("El producto que busca no se pudo encontrar");
    }
  }

  public static void eliminarProducto(Inventario inventario){
    Producto p = buscarProducto(inventario);
    if(p != null){
      System.out.println("El producto se ha eliminado exitosamente");
      inventario.eliminar(p);
    }
    else{
      System.out.println("El producto que busca no se pudo encontrar");
    }
  }

  public static void venderProducto(Inventario inventario, Inventario carrito){
    Scanner lectura = new Scanner(System.in);
    int cantidad;
    Producto producto = buscarProducto(inventario);
    if(producto != null){
      System.out.println("Hay " + producto.getCantidad() + " " + producto.getNombre() + " disponibles");
      System.out.println("¿Cuántos productos a vender?: ");
      cantidad = lectura.nextInt();
      System.out.println("Producto agregado a carrito");

      if(producto.existenSuficentes(cantidad)){
        carrito.agregar(new Producto(producto, cantidad));
      }
      else{
        System.out.println("De momento no tenemos suficientes productos de este tipo");
      }

    }
    else{
      System.out.println("El producto que busca no se pudo encontrar");
    }
  }

  public static void administarCompra(int opcion, Inventario inventario, Inventario carrito){
    switch(opcion){
      case 1:
        System.out.println("Tu compra se ha efectuado con exito");
        imprimirTicket(carrito);
        carrito.limpiar();
        break;
      case 2:
        break;
      case 3:
        System.out.println("Compra cancelada | Todos los articulos han regresado al inventario");
        cancelarCompra(carrito, inventario);
    }
  }

  public static void revisarTicket(Inventario carrito){
    System.out.println("****************************");
    System.out.println("TU COMPRA ES: ");
    System.out.println("Haz guardado en tu carrito: " + carrito.getSize() + " artículos");
    System.out.println("Estos son los articulos que haz guardado: ");
    System.out.println(carrito.imprimePrecio());
    System.out.println("El total de lo compra será de: ");
    System.out.println(carrito.calcularTotal() + "MXN");
    System.out.println("****************************");
  }

  public static void cancelarCompra(Inventario carrito, Inventario inventario){
    inventario.regresarProductos(carrito.getLista());
    carrito.limpiar();
  }

  public static void imprimirTicket(Inventario carrito){
    try{
      PrintWriter writer = new PrintWriter("Ticket.txt", "UTF-8");
      writer.println("********************************");
      writer.println("TU COMPRA: ");
      writer.println("Haz comprado: " + carrito.getSize() + " artículos");
      writer.println(carrito.imprimeTodo());
      writer.println(carrito.imprimePrecio());
      writer.println("TOTAL: ");
      writer.println(carrito.calcularTotal() + "MXN");
      writer.println("********************************");
      writer.close();
    }catch(IOException e){
      System.out.println("Error");
    }
  }
}

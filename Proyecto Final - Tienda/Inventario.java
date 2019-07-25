import java.util.ArrayList;
public class Inventario extends BaseDeDatos{

	//Metodos
  public double calcularTotal(){
    double total = 0.0;
    for(Objeto o : lista){
      Producto producto = (Producto) o;
      total += producto.getPrecioFinal() * producto.getCantidad();
    }
    return total;
  }

  public String imprimePrecio(){
    String productos = "";
    for(Objeto o : lista){
      Producto producto = (Producto) o;
      productos += producto.getCantidad() + " " + producto.getNombre() + " x " + producto.getPrecio() + " MXN más " + producto.getImpuesto()+ " MXN de impuesto "  +  "cada uno " + "\n";
    }
    return productos;
  }


  public Objeto buscar(String s){
		for(Objeto o : lista){
      Producto p = (Producto) o;
			if(p.getNombre().equals(s) || p.getCodigoDeBarras().equals(s)){
      	return p;
			}
    }
		return null;
	}

  public void regresarProductos(ArrayList<Objeto> otherList){
    for(Objeto o : lista){
      Producto p = (Producto) o;
      for(Objeto other : otherList){
        Producto i = (Producto) other;
        if(p.getNombre().equals(i.getNombre())){
          p.agregarCompra(i.getCantidad());
        }
      }
    }
  }

}

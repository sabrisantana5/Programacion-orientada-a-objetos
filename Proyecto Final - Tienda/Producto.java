public class Producto extends Objeto{

  //Variables de instancia
  private int cantidad;
  private double precio;
  private String codigoDeBarras;
  private TipoDeProducto categoria;

  //Constructores
  public Producto(String nombre, String codigoDeBarras, int cantidad, double precio, TipoDeProducto categoria){
    super(nombre);
    this.codigoDeBarras = codigoDeBarras;
    this.cantidad = cantidad;
    this.precio = precio;
    this.categoria = categoria;
  }

  public Producto(Producto other, int cantidad){
    super(other.getNombre());
    this.codigoDeBarras = other.codigoDeBarras;
    this.cantidad = cantidad;
    this.precio = other.precio;
    this.categoria = other.categoria;
  }
	//metodos
  public int getCantidad(){
    return cantidad;
  }

  public double getPrecio(){
    return precio;
  }

  public double getPrecioFinal(){
    return precio + getImpuesto();
  }

  public double getImpuesto(){
    return categoria.calcularImpuesto(precio);
  }

  public String getCodigoDeBarras(){
    return codigoDeBarras;
  }

  public void restarCompra(int venta){
    cantidad -= venta;
  }

  public void agregarCompra(int venta){
    cantidad += venta;
  }

  public boolean existenSuficentes(int venta){
    if(this.cantidad >= venta){
      restarCompra(venta);
      return true;
    }
    else{
      return false;
    }
  }

  public String toString(){
    return nombre + " es " + categoria + " con precio: " + precio;
  }

}

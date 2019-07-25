public enum TipoDeProducto{

  ALIMENTO(0.20),
  BEBIDA(0.10);

  private final double impuesto;
	//metodos
  private TipoDeProducto(double impuesto){
    this.impuesto = impuesto;
  }

  public double calcularImpuesto(double precio){
    return precio * impuesto;
  }

}

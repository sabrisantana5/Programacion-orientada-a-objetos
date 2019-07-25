public enum TipoDeUsuario{
  //Puesto(Salario, % de Bonus, Nivel de acceso)
  ADMINISTRADOR_DE_INVENTARIO(25000, 0.5),
  VENDEDOR(30000, 0.10),
  ADMINISTRADOR_DE_USUARIOS(20000, 0.5);
	//variables de instancia
  private final double salario;
  private final double bonus;
	//constructor
  private TipoDeUsuario(double salario, double bonus){
    this.salario = salario;
    this.bonus = bonus;
  }
	//metodos
  private double calcularBonus(){
    return salario * bonus;
  }

  //Impuesto sobre el trabajo
  private double calcularISPT(){
    return calcularBonus() * 0.20;
  }

}

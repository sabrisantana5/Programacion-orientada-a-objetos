//programacion orientada a objetos
//pequeños codigos reusables que se comparten para reutilizarse
//escribir,procesar y leer-funciones de la compu
//caract similares pero no son iguales, diferentes objetos

public class Cuenta
{
	public double saldo;
	public String nombre; //variable de instancia o miembro, variables del objeto

	public double ConsultaSaldo (){ 	//método para consultar saldo
		return saldo;
	}

	public void RealizarDeposito(double cantidad){ //encabezado, método para realizar retiros
		saldo =  saldo + cantidad;
		//this.saldo += saldo; /saldo-cantidad
	}
}

public class ClienteCuenta
{
	public static void main(String[]args)
	{
		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 = new Cuenta();

		double cantidad = 4550.20;

		cuenta1.RealizarDeposito(cantidad);
		cuenta1.RealizarDeposito(200);
		System.out.println(cuenta1.ConsultaSaldo());

		cuenta1.RealizarDeposito(341348.98);
		System.out.println(cuenta1.ConsultaSaldo());
	}
}

package clases;

public class ClaseHija_Deposito extends ClasePadre_Abstracta{

	@Override
	public void Transacciones() {
		System.out.print("Cuanto Dinero Desea Depositar? : $");
		Deposito();
		
		transacciones=getSaldo();
		setSaldo(transacciones+deposito);
		System.out.println("---------------------------------");
		System.out.println("Depositaste : $"+deposito);
		System.out.println("Tu Saldo Actual es : $"+getSaldo());
		System.out.println("---------------------------------");
		
	}

}

package clases;

public class ClaseHija_Consulta extends ClasePadre_Abstracta{
	
	@Override
	public void Transacciones() {
		System.out.println("---------------------------------");
		System.out.println("Tu Saldo Actual es: $"+getSaldo());
		System.out.println("---------------------------------");
	}
}

package clases;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {
	
	protected int transacciones,retiro,deposito;
	private static int saldo;
	Scanner in = new Scanner(System.in);
	
	public void Operaciones() {
		
		int bandera=0;
		int seleccion=0;
		
		//Menu Principal
		
		do {
			try {
		do {
	
			System.out.println("Por Favor Seleccione una opcion");
			System.out.println("    1-Consulta de Saldo");
			System.out.println("    2-Retiro de Efectivo");
			System.out.println("    3-Deposito de Efectivo");
			System.out.println("    4-Salir");
			
			seleccion=in.nextInt();
			if(seleccion>=1 && seleccion<=4) {
				bandera=1;
			}else {
				System.out.println("-----------------------------------");
				System.out.println("Opcion Incorrecta Vuelva a Intentar");
				System.out.println("-----------------------------------");
			}
		
		}while(bandera==0);
		
			if(seleccion==1) {
			ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
			mensajero.Transacciones();
			}else if(seleccion==2) {
				ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
				mensajero.Transacciones();
				
			}else if(seleccion==3) {
				ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
				mensajero.Transacciones();
				
			}else if(seleccion==4) {
				System.out.println("-----------------------------------");
				System.out.println("       ¡Gracias! Vuelva Pronto");
				System.out.println("-----------------------------------");
				bandera=2;
			}
			}catch (Exception e) {
				System.out.println("-----------------------------------");
				System.out.println("       Ingresaste Caracter No Valido!");
				System.out.println("-----------------------------------");
				in.nextLine();
			}
		}while(bandera!=2);
		
	}
	
	//Metodo de Retiro
	public void Retiro() {
		retiro=in.nextInt();

	}
	//Metodo de Deposito
	public void Deposito() {
		deposito=in.nextInt();

	}
	
	//Metodo Abstracto
	public abstract void Transacciones();
	
	//Metodos Get y Set Saldo
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
}
	

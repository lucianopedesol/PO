package models;

import java.util.Calendar;
import java.util.List;

public class AppCadCompra {
	public static CadCompra cadCompra = new CadCompra();
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		ClienteEspecial clienteEspecial = new ClienteEspecial(1111.00);
		Cliente cliente1 = new Cliente("luciano", "11111", clienteEspecial);
		Cliente cliente2 = new Cliente("paulo", "22222", clienteEspecial);
		Cliente cliente3 = new Cliente("fulano", "33333", clienteEspecial);
 

		cadCompra.Insert(new Compra(cliente1, calendar , 1111.00));
		cadCompra.Insert(new Compra(cliente1, calendar , 2222.00));
		cadCompra.Insert(new Compra(cliente2, calendar , 4444.00));
		cadCompra.Insert(new Compra(cliente2, calendar , 3333.00));
		cadCompra.Insert(new Compra(cliente3, calendar , 6666.00));
		cadCompra.Insert(new Compra(cliente3, calendar , 5555.00));
	  
		imprimirVetor(cadCompra.GetAll());
	}

	private static void imprimirVetor(List<Compra> vetor) {
		System.out.println("Vetor...\n");
		for (Compra value : vetor) { 
			System.out.print(value.toString() + ",\n ");
		}
	}

}

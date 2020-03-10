package ejemploColeccion;


import java.util.*;

public class APP {
	
	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Javier Cardenas", "0001", 20000);
		Cliente cl2 = new Cliente("Maria Espinosa", "0002", 250000);
		Cliente cl3 = new Cliente("Stephen English", "0003", 300000);
		Cliente cl4 = new Cliente("Dobbie Elfo", "0004", 500000);

		Cliente cl5 = new Cliente("Dobbie Elfo", "0004", 500000);
		
		Set <Cliente> clientesBanco = new HashSet <Cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		for (Cliente cliente : clientesBanco) {
			
			System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
			
			
		}
		
		
	}

}

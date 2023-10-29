package ListasEnlazadas;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		ListaEnlazada lista=new ListaEnlazada();
		System.out.println("Hola mundo ");
		
		System.out.println("LISTA ORIGINAL");
		lista.addPrimero(3.2);
		lista.addPrimero(4);
		lista.addPrimero("andres");
		lista.addPrimero(true);
		lista.addPrimero(1);
		
		lista.listar();
		
		System.out.println("--------------");
		System.out.println("LISTA INVERSA ");
		lista.listaInversa();
		lista.listar();
		
		
	}
		
}	
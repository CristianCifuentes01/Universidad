package Youtube;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		System.out.println("Escribe un numero entero: ");
		numero=entrada.nextInt();
		
		/*if(numero%2==0) {
			//si verdadera
			System.out.println(" Es par");
		}
		else {
			//no es verdadera
			System.out.println(" No es par");
		}*/
		
		System.out.println("El numero "+ numero + (numero%2==0? " Es par ": " Es impar"));

	}

}

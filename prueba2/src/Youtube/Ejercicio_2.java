package Youtube;
import java.util.Scanner;
//Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit, y viceversa 
public class Ejercicio_2 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		double gradosC=0, gradosF=0;
		
		
		System.out.println("Escribe los grados centigrados que deseas convertir: ");
		gradosC=entrada.nextDouble();
		
		gradosF=(gradosC*1.8)+32;
		
		System.out.println(gradosC+" grados centigrados, equivalen a "+gradosF+" grados fahrenheit");
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("Escribe los grados fahrenheit que deseas convertir: ");
		gradosF=entrada.nextDouble();
		
		gradosC= (gradosF-32)/1.8;
		
		System.out.println(gradosF+" grados fahrenheit, equivalen a "+ gradosC+ " grados centigrados");
		

	}

}

package Youtube;

//Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int num1=0, num2=0, suma=0;
		
		System.out.println("Puedes escribir un numero entero: ");
		num1=entrada.nextInt();
		
		System.out.println("Puedes escribir otro un numero entero: ");
		num2=entrada.nextInt();
		
		 suma=num1+num2;
		
		System.out.println("Los numeros que escribiste fueron:  "+ num1+", "+ num2);
		System.out.println("La suma de los numeros es :  "+ suma);

	}

}

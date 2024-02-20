package Youtube;
import java.util.Scanner;
public class Ejercicio_5 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		
		int num1,num2;
		
		System.out.println("Escribe un numero entero");
		num1=entrada.nextInt();
		
		System.out.println("Escribe otro numero entero");
		num2=entrada.nextInt();
		
		
		if(num1>num2) {
			System.out.println("El numero "+ num1+ " es mayor que "+ num2);
		}else if(num2>num1) {
			System.out.println("El numero "+ num2+ " es mayor que "+ num1);
		}else if(num1==num2) {
			System.out.println("Los numero son iguales");
		}
		
		
		
		
		

	}

}

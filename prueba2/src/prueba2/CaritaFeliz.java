package prueba2;
import java.util.Scanner;

public class CaritaFeliz{
	public static void  main (String Args[]) {
		Scanner entrada=new Scanner(System.in);
		
		int num1=0, num2=0;
		
		System.out.println("Escribe un numero entero: ");
		num1=entrada.nextInt();
		
		System.out.println("Escribe otro numero entero: ");
		num2=entrada.nextInt();
		
		if(num1==num2) {
			System.out.println("Los numero son iguales ");
		}else if(num1<num2) {
			System.out.println("El numero "+num2+ " es mayor que "+num1);
		}else if(num1>num2){
			System.out.println("El numero "+num1+ " es mayor que "+num2);
		}
	
				
			
		
		
	}

}

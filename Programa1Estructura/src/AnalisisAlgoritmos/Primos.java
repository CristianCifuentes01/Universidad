package AnalisisAlgoritmos;
import java.util.Scanner;
public class Primos {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int []vector=new int[4];
		int i=0;
		while (i < 4) {
			
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            
            if (entrada.hasNextInt()) {
                int elemento = entrada.nextInt();
                if (elemento > 0) {
                    vector[i] = elemento;

                    if (esPrimo(elemento)) {
                        System.out.println("Número primo encontrado en la posición " + (i + 1) + ": " + elemento);
                    }
                    i++;
                    
                    
                } else {
                    System.out.println("Error: Ingrese un número entero positivo.");
                }
            } else {
                System.out.println("Error: Ingrese un número entero válido.");
                entrada.next();
            }
            
        }

		entrada.close();
    }
		
	
	private static boolean esPrimo(int numero) {
	    if (numero < 2) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(numero); i++) {
	        if (numero % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}

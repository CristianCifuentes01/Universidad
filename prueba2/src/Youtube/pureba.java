package Youtube;
import java.util.Scanner ;

/*
 * Programa java que lea una variable entera mes y compruebe si el valor corresponde
 * a un mes de 30 días. Se debe comprobar que el valor introducido esté
 * comprendido entre 1 y 12
 */

public class pureba {
	public static void main (String args[]) {
		Scanner entrada =new Scanner(System.in);
		int x=0;
		while(x==0) {
			System.out.println("\nEscribe un numero: ");
			int num1=entrada.nextInt();
			
			System.out.println("\nEscribe otro numero: ");
			int num2=entrada.nextInt();
			 
			System.out.println();
			
			if(num2==0) {
				System.out.println("No se puede dividir entre 0 ");
				System.out.println("vuelve a intentar =(");
				x=0;
				
			}else {
				double division=(double)num1/(double)num2;
				System.out.printf("\nLa division de: %d/%d == %.2f\n",num1,num2,division);
				x=1;
			}
		}
	}

}

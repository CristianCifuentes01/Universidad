package Youtube;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		DecimalFormat decimal=new DecimalFormat("#.0");
		
		double gradosC=0, gradosF=0;
		
		int x=1, opcion=0;
		
		while(x!=0) {
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println("Elige la opcion que deseas realizar:\n"+
								"1) Convertir grados centigrados a fahrenheit. \n"+
								"2) Convertir grados fahrenheit a centigrados. \n"+
								"3) Salir");
			opcion=entrada.nextInt();
			switch(opcion) {
			
			case 1:
				
				System.out.println("\nEscribe los grados centigrados que deseas convertir: ");
				gradosC=entrada.nextDouble();
				
				gradosF=(gradosC*1.8)+32;
				
				System.out.println(gradosC+" grados centigrados, equivalen a "+decimal.format(gradosF)+" grados fahrenheit");
				
				x=1;
				break;
				
			case 2:
				System.out.println("\nEscribe los grados fahrenheit que deseas convertir: ");
				gradosF=entrada.nextDouble();
				
				gradosC= (gradosF-32)/1.8;
				
				System.out.println(gradosF+" grados fahrenheit, equivalen a "+ decimal.format(gradosC)+ " grados centigrados");
				
				x=1;
				break;
			case 3:
				System.out.println("Fin del programa =) ");
				
				x=0;
				break;
			
			default:
				System.out.println("¡¡ERROR!! Digite una opcion correcta");
				x=1;
				break;
			
			}
			
			
		}

	}

}

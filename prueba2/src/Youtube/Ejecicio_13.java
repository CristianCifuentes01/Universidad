package Youtube;

import java.util.Scanner;

public class Ejecicio_13 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);

		int numero;
		int contadorN=0, contadorP=0;
		int totalNum=0;
		
		do {
			System.out.println("Escribe un numero entero(sien 0 el programa finaliza:");
			numero=entrada.nextInt();
			
			if(numero<0) {
				contadorN++;
			}else if(numero>0){
				contadorP++;
			}
			
		}while(numero!=0);
		
		totalNum=contadorN+contadorP;
		
		System.out.println("\nTotal numeros ingresados: "+totalNum);
		System.out.println("Total numeros negativos: "+ contadorN);
		System.out.println("Total numeros positivos: "+ contadorP);
		
		
		
	}

}

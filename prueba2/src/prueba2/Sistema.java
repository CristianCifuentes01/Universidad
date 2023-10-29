package prueba2;
import java.util.*;
public class Sistema {

	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		
		String nombre="";
		int clave=0, antiguedad=0;
		
		System.out.println("*****************************************");
		System.out.println("Bienvenido al programa vacional Coca-Cola");
		System.out.println("*****************************************\n\n");
		
		System.out.println("Cual es el nombre del trabajador?");
		nombre=entrada.nextLine();
		System.out.println("\nCuantos años de servicio tiene el trabajador");
		antiguedad=entrada.nextInt();
		
		
		int x=0;
		while(x==0){
			
			System.out.println("\n¿Cual clave tiene el trebajador");
			clave=entrada.nextInt();
			
			switch(clave) {
				case 1: {
					if(antiguedad==1) {
						System.out.println("El trabajador "+nombre+" tiene derecho a 6 dias de vacaciones");
					} 
					if(antiguedad>=2 && antiguedad<=6) {
						System.out.println("El trabajador "+nombre+" tiene derecho a 14 dias de vacaciones");
					}
					if(antiguedad>=7) {
						System.out.println("El trabajador "+nombre+" tiene derecho a 20 dias de vacaciones");
					}
					x=1;
				}break;
				
				case 2: {
					if(antiguedad==1) {
						System.out.println("El trabajador "+nombre+" tiene derecho a 7 dias de vacaciones");
					} 
					if(antiguedad>=2 && antiguedad<=6) {
						System.out.println("El trabajador "+nombre+" tiene derecho a 15 dias de vacaciones");
					}
					if(antiguedad>=7) {
						System.out.println("El trabajador "+nombre+" tiene derecho a 22 dias de vacaciones");
					}
					x=1;
					
				}break;
				
				case 3: {
					if(antiguedad==1) {
						System.out.println("El trabajador "+nombre+" tiene derecho a 10 dias de vacaciones");
					} 
					if(antiguedad>=2 && antiguedad<=6) {
						System.out.println("El trabajador "+nombre+" tiene derecho a 20 dias de vacaciones");
					}
					if(antiguedad>=7) {
						System.out.println("El trabajador "+nombre+" tiene derecho a 30 dias de vacaciones");
					}
					
					x=1;
				}break;
				
				default:{
					System.out.println("La clave es incorrecta");
					x=0;	
				}break;
			
			}
		}	
			
		
		
		
	}
}

package Youtube;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		 Scanner entrada=new Scanner(System.in);
		 
		 System.out.println("Introduce el tiempo transcurrido en segundos: ");
		 int segundo_entrada=entrada.nextInt();
		 
		 int horas=segundo_entrada/3600;
		 int regundos_restantes= segundo_entrada % 3600; 
		 int minutos= regundos_restantes/ 60;
		 int segundos= regundos_restantes % 60 ;
		 
		 System.out.println("El tiempo equivalente es: "+horas+" horas, "+minutos+" minutos, "+segundos+" segundos");;
		 
	}

}

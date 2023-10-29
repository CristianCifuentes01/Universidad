/**
 * Ejemplo de uso de arrays
 * 
 * @author Luis José Sánchez
 */
import java.util.Scanner;

public class Array005 {
  public static void main(String[] args) {
	String mas; 
	Scanner entrada=new Scanner(System.in);
	
	int mascotas;
    do {
		do {
		System.out.print("Cuantas mascotas tienes?");
		mascotas = entrada.nextInt();
		} while (mascotas<=0);
		
		double[] nota = new double[mascotas];
 
    	System.out.println("Para calcular la media necesito saber la ");
    	System.out.println("edad de cada mascota.");

    	for (int i = 0; i < mascotas; i++) {
      	System.out.print("Edad de la mascota nº " + (i + 1) + ": ");
      	nota[i] = entrada.nextDouble();
    	}
    
    	System.out.println("La edad de tus mascotas es: ");
    
    	double suma = 0;
    
    	for (int i = 0; i < mascotas; i++) {
      		System.out.print(nota[i] + "  ");
			suma += nota[i];
    	}
    	System.out.println("\nLa media es " + suma / mascotas);
    	
 	System.out.println("Otra?('Si' para continuar) \n('no' para salir)");
 	mas = entrada.next();
 	
 } while(mas.equalsIgnoreCase("si"));
}
}
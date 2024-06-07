package Youtube;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		double volumen, area, radio;
		
		System.out.println("Ingresa el radio de la esfera: ");
		radio=entrada.nextDouble();
		
		volumen=(4*Math.PI*Math.pow(radio, 3))/3;
		
		area=4*Math.PI*Math.pow(radio, 2);
		
		System.out.printf("\nEl volumen de la esfera es: %.2f \n", volumen);
		System.out.printf("El area de la esfera es: %.2f ", area);
		
		
	}

}

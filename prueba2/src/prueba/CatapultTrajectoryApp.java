package prueba;
import java.util.Scanner;
public class CatapultTrajectoryApp {

	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ingresar los valores necesarios
	        System.out.print("Ingrese el ángulo de lanzamiento (en grados): ");
	        double anguloGrados = scanner.nextDouble();
	        double anfuloRadianes = Math.toRadians(anguloGrados); // Convertir a radianes

	        System.out.print("Ingrese la altura inicial (en metros): ");
	        double alturaInicial = scanner.nextDouble();

	       
	        double gravedad = 9.81; // Aceleración debida a la gravedad (m/s^2)
	        double longitudBrazo = 0.90; // Longitud del brazo de la catapulta (metros)

	      
	        double velocidadInicial = Math.sqrt(( gravedad * (10 - alturaInicial)) / Math.sin(2 * anfuloRadianes));
	        double timpoVuelo = 2 * (velocidadInicial * Math.sin(anfuloRadianes)) / gravedad;
	        double alturaM = (Math.pow(velocidadInicial, 2) * Math.pow(Math.sin(anfuloRadianes), 2)) / (2 * gravedad) + alturaInicial;
	        double distanciaM = velocidadInicial * Math.cos(anfuloRadianes) * timpoVuelo;

	        
	        System.out.println("\nResultados:");
	        System.out.println("Velocidad inicial (Vo): " + velocidadInicial + " m/s");
	        System.out.println("Tiempo de vuelo: " + timpoVuelo + " segundos");
	        System.out.println("Altura máxima: " + alturaM + " metros");
	        System.out.println("Distancia máxima: " + distanciaM + " metros");

	        scanner.close();
	    
	}
}


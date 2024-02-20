package AnalisisAlgoritmos;
import java.util.Scanner;
public class Pocision_Caballo {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la ubicación inicial del caballo (por ejemplo, 'c3'): ");
	        String posicionInicial = scanner.next().toLowerCase(); // Convertir a minúsculas para manejar tanto mayúsculas como minúsculas

	        if (validarEntrada(posicionInicial)) {
	            System.out.println("Los movimientos válidos para el caballo desde " + posicionInicial + " son:");
	            mostrarMovimientosCaballo(posicionInicial);
	        } else {
	            System.out.println("Entrada no válida. La ubicación debe ser de la forma 'letraNúmero', por ejemplo, 'c3'.");
	        }

	        scanner.close();
	    }

	    private static boolean validarEntrada(String entrada) {
	        // Verificar si la entrada tiene un formato válido (letra seguida de número)
	        return entrada.matches("[a-h][1-8]");
	    }

	    private static void mostrarMovimientosCaballo(String posicionInicial) {
	        char letra = posicionInicial.charAt(0);
	        char numero = posicionInicial.charAt(1);

	        int fila = Character.getNumericValue(numero) - 1; // Convertir el número de fila a índice (0-7)
	        int columna = letra - 'a'; // Convertir la letra de columna a índice (0-7)

	        int[] movimientosFila = { -2, -1, 1, 2, 2, 1, -1, -2 };
	        int[] movimientosColumna = { 1, 2, 2, 1, -1, -2, -2, -1 };

	        for (int i = 0; i < movimientosFila.length; i++) {
	            int nuevaFila = fila + movimientosFila[i];
	            int nuevaColumna = columna + movimientosColumna[i];

	            if (esMovimientoValido(nuevaFila, nuevaColumna)) {
	                char nuevaLetra = (char) ('a' + nuevaColumna);
	                int nuevoNumero = nuevaFila + 1;
	                System.out.print(nuevaLetra + "" + nuevoNumero + " ");
	            }
	        }

	        System.out.println(); // Salto de línea después de imprimir los movimientos
	    }

	    private static boolean esMovimientoValido(int fila, int columna) {
	        // Verificar que la nueva posición esté dentro del tablero (8x8)
	        return fila >= 0 && fila < 8 && columna >= 0 && columna < 8;
	    }
}

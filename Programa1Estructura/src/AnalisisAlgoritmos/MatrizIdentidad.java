package AnalisisAlgoritmos;
import java.util.Scanner;

public class MatrizIdentidad {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el orden de la matriz: ");
	        int n = scanner.nextInt();

	        int[][] matriz = new int[n][n];

	        for (int fila = 0; fila < n; fila++) {
	            for (int columna = 0; columna < n; columna++) {
	                if (fila == columna) {
	                    System.out.print("Ingrese el elemento U[" + (fila + 1) + "][" + (columna + 1) + "]: 1 ");
	                    matriz[fila][columna] = scanner.nextInt();

	           
	                    if (matriz[fila][columna] != 1) {
	                        System.out.println("La matriz no es unitaria.");
	                        scanner.close();
	                        return;
	                    }
	                } else {
	                    System.out.print("Ingrese el elemento U[" + (fila + 1) + "][" + (columna + 1) + "]: 0 ");
	                    matriz[fila][columna] = scanner.nextInt();

	             
	                    if (matriz[fila][columna] != 0) {
	                        System.out.println("La matriz no es unitaria.");
	                        scanner.close();
	                        return;
	                    }
	                }
	            }
	        }


	        System.out.println("La matriz es unitaria.");
	        scanner.close();
	    }

}

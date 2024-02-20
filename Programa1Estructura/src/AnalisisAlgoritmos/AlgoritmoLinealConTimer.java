package AnalisisAlgoritmos;
import java.util.Random;


public class AlgoritmoLinealConTimer {
    public static void main(String[] args) {
        int[] array = generarArrayConsecutivo(10000000); // Genera un array de 1 millón de números consecutivos
        long startTime = System.currentTimeMillis();

        int resultado = sumaLineal(array);

        long endTime = System.currentTimeMillis();
        long tiempoEjecucion = endTime - startTime;

        System.out.println("La suma es: " + resultado);
        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " milisegundos");
    }

    private static int sumaLineal(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }

    private static int[] generarArrayConsecutivo(int longitud) {
        int[] array = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            array[i] = i + 1; // Números consecutivos comenzando desde 1
        }
        return array;
    }
}


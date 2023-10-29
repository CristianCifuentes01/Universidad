package Condicionales;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;

public class SimulacionCine {
    public static void main(String[] args) {
        Queue<Integer> fila1 = new LinkedList<>();
        Queue<Integer> fila2 = new LinkedList<>();
        Stack<Integer> sala = new Stack<>();
        Random rand = new Random();

        // Simulación de llegada de personas al cine (al menos 10 personas)
        int totalPersonas = 10;
        for (int i = 0; i < totalPersonas; i++) {
            int edad = rand.nextInt(82) + 18; // Edad entre 18 y 99
            if (fila1.size() <= fila2.size()) {
                fila1.add(edad);
            } else {
                fila2.add(edad);
            }
        }

        // Mostrar cómo quedan las filas
        System.out.println("Fila 1: " + fila1);
        System.out.println("Fila 2: " + fila2);

        // Acomodador deja ingresar personas a la sala
        while (!fila1.isEmpty() || !fila2.isEmpty()) {
            int edadFila1 = fila1.peek();
            int edadFila2 = fila2.peek();

            if (edadFila1 <= edadFila2) {
                sala.push(fila1.poll());
            } else {
                sala.push(fila2.poll());
            }
        }

        // Mostrar el orden en que el acomodador deja ingresar a las personas a la sala
        System.out.println("Orden de ingreso a la sala:");
        while (!sala.isEmpty()) {
            System.out.println("Edad: " + sala.pop());
        }
    }
}

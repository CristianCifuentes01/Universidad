/**
 * Ejemplo de uso de arrays
 * 
 * @author Luis José Sánchez
 */
import java.util.Scanner;
public class Array02 {
  public static void main(String[] args) {
        
    // definición del array y reserva de memoria en la misma línea
    int[] x = new int[5];
    Scanner entrada=new Scanner(System.in);            
    x[0] = 8;
    x[1] = 33;
    x[2] = 200;
    x[3] = 150;
    x[4] = 11;
    
    System.out.println("El array x tiene 5 elementos ¿cuál de ellos quiere ver?");
    System.out.print("Introduzca un número del 1 al 5: ");
    int indice = entrada.nextInt();
    System.out.print("El elemento que se encuentra en la posición " + indice);
    System.out.println(" es el " + x[indice-1]);
  }
}

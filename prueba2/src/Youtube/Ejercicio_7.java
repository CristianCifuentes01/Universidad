package Youtube;
import java.util.Scanner;
public class Ejercicio_7 {

	public static void main(String[] args) {
		 Scanner entrada=new Scanner (System.in);
		 
		 System.out.println("Escribe la cantidad de estudientes a ingresar: ");
		 int numAlum=entrada.nextInt();
		 
		 double notas[]=new double [numAlum];
		 double suma=0,promedio=0;
		 
		 for(int i=0; i <notas.length; i++) {
			 System.out.println("escribe la nota del estudiante #"+(i+1)+": ");
			 notas[i]=entrada.nextDouble();
			 suma+=notas[i];
		 }
		 
		 promedio=suma/numAlum;
		 
		 System.out.printf("El promedio del grupo fue: %.2f\n",promedio);
		 System.out.println();
		 
		 System.out.println("Los estudiantes con nota superior al promedio fueron: ");
		 for(int i=0; i <notas.length; i++) {
			 if(notas[i]>promedio) {
				 System.out.printf("El estudiante #%d con nota: %.2f\n",i+1,notas[i]);
			 }
		 }
		

	}

}

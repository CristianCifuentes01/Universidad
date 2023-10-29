package prueba2;
import java.util.Scanner;
public class CalificacionesClase {
	public static void main(String[] Args) {
		Scanner entrada=new Scanner(System.in);
		/*
		System.out.println("Escribe la cantidad de estudiates del curso: ");
		int cantEs=entrada.nextInt();
		
		//String[] nombres=new String[cantEs];
		double[] notas=new double[cantEs];
		double suma=0;
		
		
		for(int i=0;i<notas.length;i++) {
			
			 System.out.printf("Escribe la nota del estudiante %d : \n",i+1);
			 notas[i]=entrada.nextDouble();
			 suma+=notas[i];
		}
		
		double promedio=suma/cantEs;
		System.out.printf("\nEl promedio de la clase es: %.2f \n",promedio);
		System.out.println("\nLos estudaintes que superaron el promedio: \n");
		for(int i=0;i<notas.length;i++) {
			if(notas[i]>promedio) {
				System.out.println("El estudiante "+(i+1)+". Nota: "+notas[i]);
			}
		}
		
		
		
		
		
		
		// Mostrar los nombres y las notas ordenadas de mayor a menor
        System.out.println("Estudiantes ordenados de mayor a menor nota:");
        for (int i = 0; i < cantEs; i++) {
            System.out.printf("%d. Estudiante %s, nota: %.2f\n", i + 1, nombres[i], notas[i]);
        }*/
		
		
		 Scanner sc = new Scanner(System.in);
	        int filas, columnas;

	        //lectura del número de filas y columnas de las matrices
	        do {
	            System.out.print("Número de filas: ");
	            filas = sc.nextInt();
	        } while (filas < 1);
	        do {
	            System.out.print("Número de columnas: ");
	            columnas = sc.nextInt();
	        } while (columnas < 1);

	        //crear las matrices A, B y C
	        int[][] A = new int[filas][columnas];
	        int[][] B = new int[filas][columnas];
	        int[][] C = new int[filas][columnas];

	        //Introducir los datos en las matrices A y B
	        System.out.println("matriz A:");
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < A[i].length; j++) {
	                System.out.print("Elemento[" + i + "][" + j + "] = ");                                            
	                A[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("matriz B:");
	        for (int i = 0; i < B.length; i++) {
	            for (int j = 0; j < B[i].length; j++) {
	                System.out.print("Elemento[" + i + "][" + j + "] = ");
	                B[i][j] = sc.nextInt();
	            }
	        }

	        //obtener la matriz C como suma de las matrices A y B
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < A[i].length; j++) {
	                C[i][j] = A[i][j] + B[i][j];
	            }
	        }

	        //mostrar por pantalla las matrices A y B
	        System.out.println("matriz A:");
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < A[i].length; j++) {
	                System.out.printf("%3d", A[i][j]);
	            }
	            System.out.println();
	        }
	        System.out.println("\nmatriz B:");
	        for (int i = 0; i < B.length; i++) {
	            for (int j = 0; j < B[i].length; j++) {
	                System.out.printf("%3d", B[i][j]);
	            }
	            System.out.println();
	        }

	        //mostrar la matriz suma de A + B
	        System.out.println("\nmatriz Suma:");
	        for (int i = 0; i < C.length; i++) {
	            for (int j = 0; j < C[i].length; j++) {
	                System.out.printf("%3d", C[i][j]);
	            }
	            System.out.println();
	        }
		
	}
}


package prueba2;
import java.util.Scanner;
public class Punto_3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Puedes escribir la cantidad de datos a insertar:  ");
		int cant=entrada.nextInt();
		if (cant==0) {
			System.out.println("Lo sentimos, si no ingresas datos el programa no puede iniciar :(");
			System.exit(0);
		}
		Matriz matriz = new Matriz(cant); 
		
		matriz.creacionArray();
		
		int continua=0;
		while(continua!=-1) {
			
			System.out.println("\n\nEscribe el numero de posicion que quieres cambiar: ");
			int posicion=entrada.nextInt();
			System.out.println("Escribe el numero que quieres ingresar: ");
			int numero=entrada.nextInt();
			
			matriz.insertarDato(posicion, numero);
			matriz.eliminarUltimaPosicion();
			
			
			System.out.println();
			System.out.println("\nSi deseas salir escribe -1, de lo contrario 0  ");
			continua=entrada.nextInt();
			
		}
		
	}

}
class Matriz{
	private int cant, Array[], Array2[],Array3[];
	Scanner entrada=new Scanner(System.in);
	public Matriz( int cant) {
		this.cant=cant;
		Array = new int[cant];
	}
	
	public void creacionArray() {
		for(int i=0; i<cant; i++) {
			System.out.printf("Escribe un numero para la posicion %d : ",i+1 );
			Array[i]=entrada.nextInt();
		}
		System.out.printf("\n");
		for(int i=0; i<cant; i++) {
			System.out.printf("%d\t",Array[i]);
			
		}
	}
	
	public void insertarDato(int posicion, int numero) {
		Array2=new int[Array.length+1];
		for (int i=0; i<posicion-1;i++) {
			Array2[i]=Array[i];
		}
		
		Array2[posicion-1]=numero;
		
		for(int i=posicion-1; i< Array.length; i++) {
			Array2[i+1]=Array[i];
		}
		Array=Array2;
		
		
	}
	public void eliminarUltimaPosicion() {
	    if (Array.length > 0) {
	        Array3 = new int[Array.length - 1];
	        for (int i = 0; i < Array3.length; i++) {
	            Array3[i] = Array[i];
	        }

	        
	        Array = Array3;

	       
	        System.out.println();
	        for (int i = 0; i < Array.length; i++) {
	            System.out.printf("%d\t",Array[i]);
	        }
	        
	    } else {
	        System.out.println("El arreglo ya está vacío.");
	    }
	}
	
	
}

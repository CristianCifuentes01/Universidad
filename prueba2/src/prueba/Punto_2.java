package prueba;

public class Punto_2 {

	public static void main(String args[]) {
		MatrizRamdom matriz1=new MatrizRamdom(3,3);
		System.out.println();
		System.out.print("Matriz con mumeros randoms ");
		matriz1.creaMatriz();
		
		System.out.println();
		System.out.println();
		System.out.print("Matriz con numeros multiplos de 5 de la matriz anterior ");
		
		matriz1.Multiplos();
		
		
	}
	
	
}
class MatrizRamdom{
	private int columna, fila , matriz[][],continua;

	public MatrizRamdom(int columna, int fila) {
		
		this.columna=columna;
		this.fila=fila;
		
	}
	public void creaMatriz() {
		
		matriz=new int[columna][fila]; 
		int max=30, min=1; 
		
		for(int i= 0 ;i <columna;i++) {
			System.out.println();
			for(int j=0; j<fila;j++ ) {
				
				matriz[i][j]=(int)(Math.random() * (max - min + 1)) + min;
				System.out.printf("%d\t ",matriz[i][j]);
			}
		}
		
	}
	
	public void Multiplos() {
		int multiplo=5, multiploMenos1=multiplo-1;
		
		 for (int i = 0; i < columna; i++) {
			 System.out.println();
	            for (int j = 0; j < fila; j++) {
	                int elemento = matriz[i][j];
	                //int siguienteMultiplo = ((elemento + multiploMenos1) / multiplo) * multiplo;
	                
	                if(elemento%5!=0) {
	                	int siguienteMultiplo =  elemento + (multiplo - elemento % multiplo);
	                	matriz[i][j] = siguienteMultiplo;
	                }
	                
	                
	                
	                System.out.printf("%d\t",matriz[i][j]);
	            }
	        }
	}
	
}

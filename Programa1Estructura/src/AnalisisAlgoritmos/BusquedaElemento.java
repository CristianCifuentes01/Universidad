package AnalisisAlgoritmos;

public class BusquedaElemento {

	public static void main(String[] args) {
		
		int [][] matriz= { {3,3,4},
				           {3,5,4},
				           {7,8,9}};
		
		
		int numero=4;
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(matriz[i][j]==numero) {
					System.out.println("codernada: "+i+","+j);
				}
			}
		}
		

	}

}

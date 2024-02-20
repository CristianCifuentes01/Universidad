package AnalisisAlgoritmos;

public class SumaMaxima {

	public static void main(String[] args) {
		
		int[] arreglo = {  -2, 1, -3, 4, -1, 2, 3, 5, 1, -5, 4 };
		
		int sumaAct=0;
		int valorMax=Integer.MIN_VALUE;
		
		for(int i=0;i<arreglo.length;i++) {
			
			sumaAct+=arreglo[i];
			
			if(sumaAct>valorMax) {
				valorMax=sumaAct;
			}
			
			if (sumaAct<0) {
				sumaAct=0;
			}
			
		}
		
		System.out.println("LA suma maxima es: "+valorMax);
		
	}

}

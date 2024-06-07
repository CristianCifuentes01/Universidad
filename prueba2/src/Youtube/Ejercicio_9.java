package Youtube;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);

		for(int multiplicador=1; multiplicador<=9; multiplicador++) { //ITERA EL MULTIPLICADOR 
			System.out.println();
			System.out.println("Tabla del "+multiplicador);
			for(int multiplicando=1 ; multiplicando<=10; multiplicando++) { //ITERA EL MULTIPLICANDO
				
				int producto =multiplicador*multiplicando;
				
				System.out.println(multiplicador+" x "+multiplicando+" = "+producto);
			}
		}
		
	}

}

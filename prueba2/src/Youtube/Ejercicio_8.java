package Youtube;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("ingresa el numero de la tabla que deseas saber: ");
		
		int multiplicador=entrada.nextInt();
		
		for(int multiplicando=1; multiplicando<=10; multiplicando++) {
			
			int producto=multiplicador*multiplicando;
			
			System.out.println(multiplicador+" x "+multiplicando+" = "+producto);
			
		}
		

	}

}

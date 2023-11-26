package Youtube;

import java.util.Scanner;

public class tablas{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in );
		
		int numero=8,producto=0;
		
		for(int i=1; i<=10;i++) {
			producto=numero*i;
			System.out.println(numero+" x "+i+" = "+producto);
			
		}
		
	}

}

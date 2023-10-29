package Youtube;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Grados {

	public static void main(String[] args) {


		Scanner entrada=new Scanner (System.in);
		DecimalFormat decimal = new DecimalFormat("#.0");
		
		
		double gradosF=0,gradosC=0;
		int x=1, opcion=0;
		
		while(x!=0) {
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("Elije la opcion que deseas realizar:"+
							"\n1) Convertir grados centígrados a fahrenheit. "+
							"\n2) convertir grados fahrenheit a centigrados. "+
							"\n3) Salir.");
			opcion=entrada.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println();
				System.out.println("Escribe los grados centigrados que deseas convertir: ");
				gradosC=entrada.nextDouble();
				
				gradosF= (gradosC*1.8)+32;
				
				System.out.println("Lo grados centigrados "+gradosC+" equivalen a "+
						decimal.format(gradosF)+" grados fahrenheit");
				x=1;
				break;
			case 2:
				System.out.println();
				System.out.println("Escribe los grados fahrenheit que deseas convertir: ");
				gradosF=entrada.nextDouble();
				
				gradosC= (gradosF-32)/(1.8);
				
				System.out.println("Lo grados fahrenheit "+gradosF+" equivalen a "+
						decimal.format(gradosC)+"  grados centigrados");
				x=1;
				break;
			case 3:
				System.out.println("Fin del programa =) ");
				x=0;
				break;
				
			default: 
				System.out.println();
				System.out.println("¡Error de eleccion! Elige una opcion correcta");
				x=1;
				break;
			
			}
		}

	}

}

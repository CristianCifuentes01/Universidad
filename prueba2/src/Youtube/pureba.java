package Youtube;
import java.util.Scanner ;
/*
 * Programa que REALICE UNA FACTURADE UN PRODUCTO, AL FINAL DEL PROGRAMA SE MOSTRARA 
 * EL NOMBRE, LA CANTIDAD COMPRADA, PRECIO SIN IVA, Y PRECIO CON IVA DEL PRODUCTO 
 */

public class pureba {
	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		
		int a = 10, i=a;
		System.out.println("a\ti\tsalida\n-----------------------");
		 
		while(i <= 22 ) {
			 
			 if(i==a) {
				 System.out.printf("%d",a);
			 }
			 
			 int salida=i*2;
		     System.out.println("\t"+i+"\t"+salida);                               
		     i+=3;
		 }
        
    }

}

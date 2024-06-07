package Youtube;

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);

		String nombreProducto;
		double precioUnitario;
		int cantidad;
		double iva;
		
		System.out.println("Escribe el nombre del producto: ");
		nombreProducto=entrada.nextLine();
		System.out.println("Escribe el precio unitario del producto: ");
		precioUnitario=entrada.nextDouble();
		System.out.println("Escribe el numero de productos vendidos: ");
		cantidad=entrada.nextInt();
		System.out.println("Escribe el valor del iva(%): ");
		iva=entrada.nextDouble();
		
		double precioSinIva= precioUnitario*cantidad;
		double precioConIva= precioSinIva+(precioSinIva*(iva/100));
		
		System.out.println("\n-----------------------------------------");
		System.out.println("Factura\nNombre del producto: "+nombreProducto
				+"\nCantidad compra: "+cantidad
				+"\nPrecio sin iva: "+precioSinIva+
				"\nprecio tolta a pagar: "+ precioConIva);
		
		
		
		
		
	
	}

}

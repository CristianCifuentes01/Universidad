package prueba2;
import java.util.Scanner;
import java.util.GregorianCalendar;
public class ProcesoVentas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Etapa 1: Realización del pedido (Cliente)
        System.out.println("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
      
        System.out.println("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        
        System.out.println("Ingrese la cantidad de productos solicitados: ");
        int cantidad = scanner.nextInt();
        
        System.out.println("¿Cómo desea pagar?\n"
        		+ "1) Credito\n"
        		+ "2) Debito"
        		+ "Escribia el numero de su eleccion:  ");
        int formPago = scanner.nextInt();
        
        Cliente cliente = new Cliente(nombreCliente, 500000, 30);
        Producto producto = new Producto(nombreProducto, precioProducto,cantidad);
        Pedido pedido = new Pedido(cliente,nombreProducto, precioProducto,cantidad);
        
        
        // Etapa 2: Control de riesgo del cliente
        // Etapa 3: Envío de la orden de expedición (Simulación)
        pedido.riesgoCliente(formPago);

        // Etapa 4: Expedición y entrega de la mercancía (Simulación)
        producto.validacion();

        // Etapa 5: Elaboración y envío de la factura
        
        pedido.darFactura();

        // Etapa 6: Cobro de la factura (Simulación)
        pedido.pago();        

        
        scanner.close();
    }
}


class Cliente {
    private String nombre;
    private double riesgoMaximo;
    private int plazoPago;

    public Cliente(String nombre, double riesgoMaximo, int plazoPago) {
        this.nombre = nombre;
        this.riesgoMaximo = riesgoMaximo;
        this.plazoPago = plazoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public double getRiesgoMaximo() {
        return riesgoMaximo;
    }

    public int getPlazoPago() {
        return plazoPago;
    }
    
}


class Producto {
    private String nombreP;
    private double precio;
    private int cantidad;
    private String validacion;
    public Producto(String nombreP, double precio, int cantidad) {
        this.nombreP = nombreP;
        this.precio = precio;
        this.cantidad=cantidad;
        
    }

    public String getNameP() {
    	
        return nombreP;
    }

    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
    	return cantidad; 
    }
    
    public void validacion() {
    	validacion=nombreP;
    	if(validacion.equalsIgnoreCase(nombreP)) {
    		System.out.println("Verificación de existencia de mercancía en el almacén.");
            System.out.println("Preparación y acondicionamiento del pedido.");
            System.out.println("Transporte de la mercancía.");
            System.out.println("Recepción de la mercancía por el cliente y firma del recibo de entrega.");
    	}
    }
}



class Pedido extends Producto {
    private Cliente cliente;
    private double total;
    Scanner entrada=new Scanner(System.in);
    GregorianCalendar calendario=new GregorianCalendar();
    
    public Pedido(Cliente cliente, String nombre, double precio, int cantidad) {
    	super(nombre,precio,cantidad);
        this.cliente=cliente; 
        
    }

    public double getTotal() {
    	total=getPrecio()*getCantidad(); 
        return total;
    }
    
    
    public void riesgoCliente(int formPago) {	
    	if(formPago==1) {
    		if(getTotal()>500000) {
    			System.out.println("\nLo sentimos no podemos generar un credito mayor a 500000 =(");
    			System.exit(0);
    		}else {
    			System.out.println("Se envió la orden de expedición al almacén.\n");
    			System.out.println("El cliente deberá realizar el pago en " +cliente.getPlazoPago() + " días.\n");
    		}
    	}
    	if(formPago==2) {
    		System.out.println("Se envió la orden de expedición al almacén.\n");
    	}
    }
    
    

    public void darFactura() {
    	System.out.println("\nFactura generada y enviada al cliente.");
        System.out.println(  "\nNombre del Cliente: "+cliente.getNombre()
        					+"\nNombre del Producto: "+getNameP()
        					+"\nPrecio Producto:  "+getPrecio()
        					+"\nCantidad por unidad: "+getCantidad()
        					+"\nTotal a pagar: $" + getTotal()
        					+"\nFecha de facturacion: "+calendario.getTime()+"\n");
    }
    
    public void pago() {
    	System.out.println("\nTramite de pago \n");
    	System.out.println("Escribe el numero de tu targeta: ");
    	int numTarjeta=entrada.nextInt();
    	System.out.println("Escribe el numero de tu codigo de seguridad: ");
    	int codTarjeta=entrada.nextInt();
    	System.out.println("Escribe la fecha de validez: ");
    	int fechaTarjeta=entrada.nextInt();
    	
    	System.out.println("¡¡Gracias por su compra!! ");
        
    }
   
}






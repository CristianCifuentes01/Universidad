package Estructura;

public class mainNodo {

	public static void main(String[] args) {
		Nodo primer=new Nodo ("ejemplo");
		Nodo segundo=new Nodo (12);
		Nodo tercero=new Nodo ("hola ");
		
		primer.enlazarSiguiente(segundo);
		primer.obtenerSiguiete().enlazarSiguiente(tercero);

		System.out.println(primer.obtenerSiguiete()
				.obtenerSiguiete()
				.obtenerElemento());
	}

}

package Estructura;

public class Nodo {

	Object elemento;
	Nodo siguiente;
	public Nodo(Object elemento)  {
		this.elemento=elemento;
		this.siguiente=null;
	}
	public Object obtenerElemento() {
		return elemento;
	}
	
	public void enlazarSiguiente(Nodo nodo) {
		siguiente=nodo;
	}
	public Nodo obtenerSiguiete() {
		return siguiente;
	}

}

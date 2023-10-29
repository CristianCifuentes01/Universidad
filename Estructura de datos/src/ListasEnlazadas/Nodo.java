package ListasEnlazadas;

public class Nodo<T> {

	private T valor;
	private Nodo<T> siguiente;
	
	public Nodo( T valor ) {
		this.valor=valor;
		this.siguiente=null;
	}
	public T obtenerValor() {
		return valor;
	}
	public void enlazarSiguente(Nodo<T> n) {
		siguiente=n;
	}
	public Nodo<T> obtenerSiguiente() {
		return siguiente;
	}
}

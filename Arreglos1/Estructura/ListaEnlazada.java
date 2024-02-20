package Estructura;

public class ListaEnlazada {

	public static void main (String args []) {
		ListaEnlazada lista=new ListaEnlazada();
		
		System.out.println("Esta vacia: "+lista.estaVacia());
		lista.addPrimero(1);
		lista.addPrimero("Jorge");
		lista.addPrimero(5);
		
		lista.addPrimero("Hola que tal");
		
		System.out.println("Primer elemento: "+lista.obtener(0));
		System.out.println("Ultimo elemento: "+lista.obtener(lista.size()-1));
		System.out.println("Esta vacia: "+lista.estaVacia());
		System.out.println("Tamaño lista: "+lista.size());
		System.out.println();
		System.out.println("Lista: ");
		lista.listar();
		
		
	}
	
	
	Nodo cabeza;
	int tam;
	public ListaEnlazada() {
		cabeza=null;
		tam=0;
		
	}
	public Object obtener(int posicion) {
		int contador =0;
		Nodo temp=cabeza;
		while(contador<posicion) {
			temp=temp.obtenerSiguiete();
			contador++;
		}
		return temp.obtenerElemento();
	}
	
	public void addPrimero(Object obj) {
		if(cabeza==null) {
			cabeza=new Nodo(obj);
		}
		else {
			Nodo temp=cabeza;
			Nodo nuevo=new Nodo(obj);
			
			nuevo.enlazarSiguiente(temp);
			cabeza=nuevo;
			
		}
		tam++;
	}
	public int size() {
		return tam;
	}
	public boolean estaVacia() {
		if(cabeza==null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void listar() {
	    Nodo temp = cabeza;
	    while (temp != null) {
	        System.out.print(temp.obtenerElemento() + "\n");
	        temp = temp.obtenerSiguiete();
	    }
	    System.out.println();
	
	}

}

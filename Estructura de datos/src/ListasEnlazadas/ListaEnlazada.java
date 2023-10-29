package ListasEnlazadas;

public class ListaEnlazada<T> {

    private Nodo<T> cabeza;
    private int tam;

    public ListaEnlazada() {
        this.cabeza = null;
        this.tam = 0;
    }

    public void addPrimero(T obj) {
        if (cabeza == null) {
            cabeza = new Nodo<>(obj);
        } else {
            Nodo<T> temp = cabeza;
            Nodo<T> nuevo = new Nodo<>(obj);
            nuevo.enlazarSiguente(temp);
            cabeza = nuevo;
        }
        tam++;
    }

    public T obtener(int posicion) {
        int contador = 0;
        Nodo<T> temporal = cabeza;
        while (contador < posicion) {
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }

    public int obtenerTamaño() {
        return tam;
    }

    public boolean listaVacia() {
        return cabeza == null;
    }

    public void eliminarPrimero() {
        cabeza = cabeza.obtenerSiguiente();
        tam--;
    }

    public void eliminarEnPosicion(int posicion) {
        if (posicion == 0) {
            cabeza = cabeza.obtenerSiguiente();
        } else {
            int contador = 0;
            Nodo<T> temporal = cabeza;
            while (contador < posicion - 1) {
                temporal = temporal.obtenerSiguiente();
                contador++;
            }
            temporal.enlazarSiguente(temporal.obtenerSiguiente().obtenerSiguiente());
        }
        tam--;
    }

    public void cortarEnPosicion(int posicion) {
        int contador = 0;
        Nodo<T> temporal = cabeza;
        while (contador < posicion - 1) {
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        temporal.enlazarSiguente(null);
        tam = posicion;
    }

    public void listar() {
        Nodo<T> actual = cabeza;
        if(cabeza==null) {
        	System.out.println("Lista vacia.");
        	
        }else {
	        while (actual!= null) {
	        	System.out.println(actual.obtenerValor());
	            actual = actual.obtenerSiguiente();
	            
	            
	        }
        }
        
    }
    public void listaInversa() {
    	Nodo<T> anterior=null;
    	Nodo<T> actual=cabeza;
    	Nodo<T> siguiente=null;
    	
		while (actual != null) {
			siguiente = actual.obtenerSiguiente();
	        actual.enlazarSiguente(anterior);
	        anterior = actual;
	        actual = siguiente;
       }
		cabeza=anterior;
	}
    
    	
    	
      
}

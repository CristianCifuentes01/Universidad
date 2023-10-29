package ListasDobles;

public class Nodo {

	private Nodo anterior,siguiente;
	private Object obj;
	
	public Nodo(Object obj, Nodo anterior, Nodo siguiente) {
		this.anterior=anterior;
		this.siguiente=siguiente;
		this.obj=obj;
	}
	public void eliminarNodo() {
        // Verificar si hay un nodo anterior
        if (anterior != null) {
            anterior.setSiguiente(siguiente);
        }

        // Verificar si hay un nodo siguiente
        if (siguiente != null) {
            siguiente.setAnterior(anterior);
        }
    }


	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}

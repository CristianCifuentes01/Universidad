package ListasDobles;

public class Lista_Doble {

	private Nodo inicio,fin;
	
	public Lista_Doble() {
		inicio=null;
		fin=null;
	}
	public void insertarInicio(Object dato) {
		if (inicio==null) {
			inicio=new Nodo(dato,null,null);
			fin=inicio;
		}
		else {
			Nodo actual=new Nodo (dato,null,inicio);
			inicio.setAnterior(actual);
			inicio=actual;
		}
	}
	
	public void insertarFinal(Object dato) {
		if (inicio==null) {
			fin=new Nodo(dato,null,null);
			inicio=fin;
		}
		else {
			Nodo actual=new Nodo (dato,fin,null);
			fin.setSiguiente(actual);
			fin=actual;
		}
	}
	
	public Object eliminarInicio() {
		Object dato=inicio.getObj();
		inicio=inicio.getSiguiente();
		if(inicio!=null) {
			inicio.setAnterior(null);
			
		}
		else {
			fin=null;
		}
		return dato;
	}
	
	public Object eliminarFin() {
		Object dato=fin.getObj();
		fin=fin.getAnterior();
		if(fin!=null) {
			fin.setSiguiente(null);
			
		}
		else {
			inicio=null;
		}
		return dato;
	}
	
	public void listarAdelante() {
		Nodo actual=inicio;
		while(actual!=null) {
			
			System.out.println(actual.getObj());
			actual=actual.getSiguiente();
			
		}
	}
	
	public void listarAtras() {
		Nodo actual=fin;
		while(actual!=null) {
			
			System.out.println(actual.getObj());
			actual=actual.getAnterior();
			
		}
	}
	public Boolean buscar(Object dato) {
		
		Nodo actual=inicio;
		
		while(actual!=null) {
			
			if(actual.getObj().equals(dato)) {
				return true; 
			}
			
			actual=actual.getSiguiente();
		}
		return false;
	}
	
	
	public void invertirLista() {
	    Nodo actual = inicio;
	    Nodo temp = null;

	    while (actual != null) {
	        temp = actual.getAnterior();
	        actual.setAnterior(actual.getSiguiente());
	        actual.setSiguiente(temp);
	        actual = actual.getAnterior();
	    }

	    // Actualizar inicio y fin
	    if (temp != null) {
	        inicio = temp.getAnterior();
	    }
	}
	
	public void unirListas(Lista_Doble otraLista) {
	    if (otraLista.inicio != null) {
	        fin.setSiguiente(otraLista.inicio);
	        otraLista.inicio.setAnterior(fin);
	        fin = otraLista.fin;
	    }
	}
	public void eliminarNodo(Nodo nodo) {
        if (nodo != null) {
            nodo.eliminarNodo();
        }
    }
	
	public void eliminarDuplicados() {
	    Nodo actual = inicio;

	    while (actual != null) {
	        Nodo siguiente = actual.getSiguiente();
	        while (siguiente != null) {
	            if (actual.getObj().equals(siguiente.getObj())) {
	                // Eliminar el nodo duplicado
	                Nodo temp = siguiente;
	                siguiente = siguiente.getSiguiente();
	                eliminarNodo(temp);
	            } else {
	                siguiente = siguiente.getSiguiente();
	            }
	        }
	        actual = actual.getSiguiente();
	    }
	}
		
}

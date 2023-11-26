package Arboles;

public class taller_5 {

	public static void main(String []args) {
		ArbolBinario2 arbolOriginal = new ArbolBinario2();
		arbolOriginal.insert(new Persona("1105364722", "Santiago", "Santiago@outlook.com"));
        arbolOriginal.insert(new Persona("1111540889", "Juan", "Juan@gmail.com"));
        arbolOriginal.insert(new Persona("1108639445", "cristian", "cristian@hotmail.com"));
        arbolOriginal.insert(new Persona("1114308811", "ing Arley", "inge@usc.co"));
        arbolOriginal.insert(new Persona("1114308811", "ing Arley", "inge@usc.co"));
        arbolOriginal.insert(new Persona("1114308811", "ing Arley", "inge@usc.co"));

        
        System.out.println("Personas en el árbol original:");
        arbolOriginal.busquedaInOrden(arbolOriginal.raiz);

  
        System.out.println("\nEliminar persona con cédula 1108639445");
        arbolOriginal.eliminar("1108639445");
        arbolOriginal.busquedaInOrden(arbolOriginal.raiz);

    
        ArbolBinario2 arbolClon = arbolOriginal.clonarArbol();

        
        System.out.println("\nPersonas en el árbol clonado:");
        arbolClon.busquedaInOrden(arbolClon.raiz);
	}
}

class Persona{
	
	String cedula;
	 String gmail, nombre;
	public Persona(String  cedula, String nombre,String gmail) {
		
		this.cedula=cedula;
		this.gmail=gmail;
		this.nombre=nombre;
		
		
	}

}

class NodoA {
	
	Persona person;
	NodoA left;
	NodoA right;
	NodoA (Persona person){
		this.person=person;
		right =null;
		left=null;
	}

	
	
}


class ArbolBinario2{
	NodoA raiz;
	
		ArbolBinario2( ){
		this.raiz=null;
		
	}
		
	
		private NodoA addRec(NodoA raiz, Persona person) {
		    if (raiz == null) {
		        raiz = new NodoA(person);
		        return raiz;
		    }

		    int comparacionC = person.cedula.compareTo(raiz.person.cedula);
		    if (comparacionC < 0) {
		        raiz.left = addRec(raiz.left, person);
		    } else if (comparacionC > 0) {
		        raiz.right = addRec(raiz.right, person);
		    }
		    return raiz;
		}

	
	public void insert (Persona person) {
		raiz=addRec(raiz,person);
	}
	public NodoA minimoNodo(NodoA raiz) {
		while(raiz.left!=null) {
			raiz=raiz.left;
		}
		return raiz;
	}
	
	public void eliminar(String cedula) {
		raiz=eliminarRec(raiz,cedula);
	}
	private NodoA eliminarRec(NodoA raiz, String Cedula) {
	    if (raiz == null) {
	        return raiz;
	    }

	    int comparacionC = Cedula.compareTo(raiz.person.cedula);
	    if (comparacionC < 0) {
	        raiz.left = eliminarRec(raiz.left, Cedula);
	    } else if (comparacionC > 0) {
	        raiz.right = eliminarRec(raiz.right, Cedula);
	    } else {
	        if (raiz.left == null) {
	            return raiz.right;
	        } else if (raiz.right == null) {
	            return raiz.left;
	        }
	        raiz.person = minimoNodo(raiz.right).person;
	        raiz.right = eliminarRec(raiz.right, raiz.person.cedula);
	    }
	    return raiz;
	}

	
    //realiza un recorrido inorder (izquierda, raíz, derecha)
    public void busquedaInOrden(NodoA raiz) {
        if (raiz != null) {
            busquedaInOrden(raiz.left);
            System.out.println("Cédula: " + raiz.person.cedula + ", Nombre: " + raiz.person.nombre + " \tEmail: " + raiz.person.gmail);
            busquedaInOrden(raiz.right);
        }
    }

    // clona un árbol
    public ArbolBinario2 clonarArbol() {
        ArbolBinario2 arbolClon = new ArbolBinario2();
        arbolClon.raiz = clonarArbolRec(raiz);
        return arbolClon;
    }

    //clona un árbol recursivamente
    private NodoA clonarArbolRec(NodoA raiz) {
        if (raiz == null) {
            return null;
        }

        NodoA nodoClon = new NodoA(raiz.person);
        nodoClon.left = clonarArbolRec(raiz.left);
        nodoClon.right = clonarArbolRec(raiz.right);

        return nodoClon;
    }
}



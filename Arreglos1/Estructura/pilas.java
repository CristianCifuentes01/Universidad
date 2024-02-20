package Estructura;

import java.util.Stack; 
public class pilas {

	public static void main(String[] args) {
		Stack pila=new Stack();
		
		
		// PUSH-- añadir un elemento
		pila.push(2);
		pila.push(1);
		pila.push(4);
		pila.push(7);
		// ORDEN: 2,1,4,7
		
		
		// POP-- es para sacar el elemnto final
		
		pila.pop();
		//elimina el 7
		
		
		// PEEK-- mirar el ultimo elemto de la pila
		System.out.println(pila.peek()); 
		//ahora el 4 es el ultimo elemnto
		
		
		
		//EMPTY-- saber si la pila esta vacia
		System.out.println(pila.empty());
		// retorna false porque aun tiene datos en la pila 

	}

}

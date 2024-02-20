package Estructura;

public class Pila_1 {

	public static void main (String args[]) {
		
		Pila_1 pila=new Pila_1();
		System.out.println(pila.empty());
		pila.push("1");
		pila.push("2");
		pila.push("3");
		pila.push("4");
		
		System.out.println(pila.peek());
		System.out.println(pila.empty());
		System.out.println("Se elimina: "+pila.pop());
		System.out.println(pila.empty());
		System.out.println(pila.peek());
		
	}
	
	
	Object arr[];
	//int tam;
	int top;
	public Pila_1() {
		
		
		arr=new Object [1];
		top=0;
		
	}
	public boolean empty() {
		
		if(top==0) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public void push(Object elemento) {
		if(top<arr.length) {
			arr[top]=elemento;
			top++;
		}
		else {
			Object temporal[]=new Object[arr.length+1];
			for(int i=0; i<arr.length;i++) {
				temporal[i]=arr[i];
			}
			arr=temporal;
			
			arr[top]=elemento;
			top++;
		}
		
	}
	
	public Object peek() {
		if(top>0) {
			return arr[top-1];
		}else {
			return null;
		}
	}
	
	public Object pop() {
		Object temporal=null;
		if(top>0) {
			temporal=arr[top-1];
			arr[top-1]=null;
			top--;
		}
		return temporal;
	}

}

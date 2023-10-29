package ListasDobles;

public class Main {

	public static void main(String[] args) {
		
		Lista_Doble lista=new Lista_Doble();
		lista.insertarInicio(2);
		lista.insertarInicio(3);
		lista.insertarFinal(4);
		
		lista.listarAdelante();
		//lista.listarAtras();
		 System.out.println("------------------------");
		 System.out.println("Eliminado la cabeza "+lista.eliminarInicio() );
		 lista.listarAdelante();
	}

}

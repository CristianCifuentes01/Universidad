package prueba2;
import java.util.Random;
public class MainTesoro {

	public static void main(String[] args) {
		Busca_Tesoro tesoro=new Busca_Tesoro();
		tesoro.crearTablero();
		tesoro.asignaTesoro();
		tesoro.asignaMinas();
		tesoro.muestraTablero();
		tesoro.partida();

	}
}



class Busca_Tesoro{
	private int columnasA, filasA, columnas=5,filas=4, contador=0;
	private boolean Perdio=false;
	Contenido [][]tablero=new Contenido[filas][columnas];
	Random random=new Random();
	
	public enum Contenido{
		Vacio,Tesoro,Mina
	}
	
	public void crearTablero() {
		
		for(int i =0; i<filas ;i++) {
			for(int j=0; j<columnas ;j++) {
				tablero[i][j]=Contenido.Vacio; 
			}
		}
	}
	
	public void asignaTesoro(){
		filasA=random.nextInt(3);
		columnasA=random.nextInt(4);

		tablero[filasA][columnasA]=Contenido.Tesoro;
		
	}
	public void asignaMinas() {
		
		while(contador!=3) {
			filasA=random.nextInt(3);
			columnasA=random.nextInt(4);
			
			if(tablero[filasA][columnasA]==Contenido.Vacio) {
				
				tablero[filasA][columnasA]=Contenido.Mina;
				
				contador++;
			}
		}
	}
	public void muestraTablero() {
		
			for(int i=0;i<filas;i++) {
					
				System.out.println();
					
				for(int j=0;j<columnas;j++) {
						
					switch(tablero[i][j]) {
						
					case Mina:
						System.out.printf(" \tBomba "); 
						break;
					case Tesoro:
						System.out.printf(" \tTesoro"); 
						break;
					case Vacio:
						System.out.printf(" \tVacio "); 
						break;
						
					}
				}
			}
	}
	public void partida() {
		contador=1;
		while(Perdio!=true) {
			
			filasA=random.nextInt(3);
			columnasA=random.nextInt(4);
			
			if (tablero[filasA][columnasA]==Contenido.Mina) {
				System.out.println("\nPartida "+contador
								  +"\nEleccion:"
								  +"\n fila: "+(filasA+1)
								  +"  columna: "+(columnasA+1)
								  +"\n ¡¡PERDISTE!! =( \n");
				Perdio=true;
			}else if(tablero[filasA][columnasA]==Contenido.Tesoro) {
				System.out.println("\nPartida "+contador
						  +"\nEleccion:"
						  +"\n fila: "+(filasA+1)
						  +"  columna: "+(columnasA+1)
						  +"\n ¡¡GANASTE!! =) \n");
				Perdio=true;
			}
			else if(tablero[filasA][columnasA]==Contenido.Vacio) {
				System.out.println("\nPartida "+contador
						  +"\nEleccion:"
						  +"\n fila: "+(filasA+1)
						  +"  columna: "+(columnasA+1)
						  +"\n Esta vacia su eleccion =( \n");
				contador++;
			}
			
		}
		
	}
		
}

package prueba2;

import java.util.Scanner;
//juan sebastian obando 1000593423
//cristian andres cifuentes 1108639445
//juan david ledesma 1111540889
//santiago restrepo ortega 1105364722 

public class Taller_clase {
	
	final static int filas = 20;
	final static int columnas = 3;
	static int triki[][] = new int[filas][columnas];
	
	public static void main(String[] args) {
		
		llenar_partidas();
		evaluar_partidas();
		imprimir();
		contar();
		historial();
		
		

	}
	public static void imprimir() {
		for(int i=0;i<filas;i++) {
			System.out.println();
			int jugador1=triki[i][0];
			int jugador2=triki[i][1];
			int resultado=triki[i][2];
			System.out.printf("\nLa partida %d tuvo estos resultados:\n",i+1);
			switch(jugador1) {
			case 1:
				System.out.printf("El jugador 1 saco piedra\n");
				break;
			case 2:
				System.out.printf("El jugador 1 saco papel\n");
				break;
			case 3:
				System.out.printf("El jugador 1 saco tijera\n");
				break;
			}
			switch(jugador2) {
			case 1:
				System.out.printf("El jugador 2 saco piedra\n");
				break;
			case 2:
				System.out.printf("El jugador 2 saco papel\n");
				break;
			case 3:
				System.out.printf("El jugador 2 saco tijera\n");
				break;
			}
			switch(resultado) {
			case 0:
				System.out.printf("Fue empate\n");
				break;
			case 1:
				System.out.printf("El ganador fue el jugador 1\n");
				break;
			case 2:
				System.out.printf("El ganador fue el jugador 2\n");
				break;
			}
		}
		
		
	}
	
	public static void llenar_partidas(){
		int max=3;
		int min=1;
				
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas-1;j++) {
				triki[i][j] = (int) (Math.random() * (max - min + 1)+ min);
			}
		}
		
		
	}

	public static void evaluar_partidas(){
		for(int i=0;i<filas;i++) {
			int jugador1 = triki[i][0];
			int jugador2 = triki[i][1];
			
			if( jugador1 == jugador2) {
				triki[i][2]=0;	
			} else {
				if ( ((jugador1 == 1) && (jugador2==2)) || ((jugador1 == 2) && (jugador2==3) ) || ((jugador1==3)&&(jugador2==1)) ) {
					triki[i][2]=2;	
				} else {
					triki[i][2]=1;
				}
			} 
			
			 
			
			}
		}
	
	public static void contar() {
		int ganador1=0;
		int ganador2=0;
		int empates=0;
		
		for(int i=0;i<filas;i++) {
			
				if (triki[i][2]==1) {
					ganador1++;
				} else if (triki[i][2]==2) {
					ganador2++;
				} else if (triki[i][2]==0) {
					empates++;
				}
		}
		
		System.out.printf("\n\nEl jugador 1 gano:%d \nEl jugador 2 gano:%d \nHubo %d empates.",ganador1,ganador2,empates);
		
		for(int j=0;j<columnas-1;j++) {
			int papel=0,tijera = 0, piedra=0;
			for(int i=0;i<filas;i++){
				if (triki[i][j]==1) {
					piedra++;
				} else if (triki[i][j]==2) {
					papel++;
				} else if (triki[i][j]==3) {
					tijera++;
				}
			}
			System.out.printf("\nJugador %d: \npapel:%d \npiedra:%d \ntijera:%d\n",j+1,papel,piedra,tijera);
		}
		System.out.println();
		System.out.println();
		
	}
	
	public static void historial() {
		int x = (int) (Math.random() * (filas - 0 + 1)+ 0);
		int jugador1=triki[x-1][0];
		int jugador2=triki[x-1][1];
		int resultado=triki[x-1][2];
		System.out.printf("\nLa partida generada aleatoriamente fue la %d sus resultados son:\n",x);
		switch(jugador1) {
		case 1:
			System.out.printf("El jugador 1 saco piedra\n");
			break;
		case 2:
			System.out.printf("El jugador 1 saco papel\n");
			break;
		case 3:
			System.out.printf("El jugador 1 saco tijera\n");
			break;
		}
		switch(jugador2) {
		case 1:
			System.out.printf("El jugador 2 saco piedra\n");
			break;
		case 2:
			System.out.printf("El jugador 2 saco papel\n");
			break;
		case 3:
			System.out.printf("El jugador 2 saco tijera\n");
			break;
		}
		switch(resultado) {
		case 0:
			System.out.printf("Fue empate\n");
			break;
		case 1:
			System.out.printf("El ganador fue el jugador 1\n");
			break;
		case 2:
			System.out.printf("El ganador fue el jugador 2\n");
			break;
		}
	}
}

	
	

	


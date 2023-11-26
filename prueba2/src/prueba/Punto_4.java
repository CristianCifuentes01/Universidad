package prueba;

import java.util.*;
public class Punto_4 {

	
	

		public static void main(String[] args) {

			Scanner entrada=new Scanner(System.in);
			System.out.println("Escribe la cantidad de personas a registrar: ");
			int cantidadP=entrada.nextInt();
			persona personas[]=new persona[cantidadP];
			int decision=0,menoredad=0,totalsueldo=0,promedio=0;
			boolean inserto=false;
			persona personas1[]=new persona[cantidadP+1];
			
			for (int i = 0; i < personas.length; i++) {
				
				personas[i] = new persona(); 
				personas[i].asignaValores();
				
		      }
			for (int i = 0; i < personas.length; i++) {
				
				personas1[i] = new persona();
	            personas1[i].copiarDesde(personas[i]);
				
				
		      }
			
			while(decision!=5) {
				System.out.println("\n\nBienvenido.\n"
						+"1) Crear una nueva persona.\n"
						+"2) Lista de personas.\n"
						+"3) Indicar el sueldo promedio de todas las personas registras.\n"
						+"4) Indicar el nombre de la persona mas joven.\n"
						+"5) Salir.");
				decision=entrada.nextInt();
				switch(decision) {
				case 1:

					if (personas1.length <= cantidadP+1) {
                        personas1[cantidadP] = new persona();
                        personas1[cantidadP].asignaValores();
                        inserto = true;
                        cantidadP++;
					}
					
					
					break;
				case 2:
					if(inserto==false) {
						
						for(persona x : personas) {
							x.getlista();
						}
						
					} else {
						for(persona x : personas1) {
							x.getlista();
						}
						
					}
					break;
				case 3:
					if(inserto==false) {
						for(persona x :personas) {
							totalsueldo=totalsueldo+x.getSueldo();
						}
						promedio=totalsueldo/personas.length;
						System.out.println("El Promedio de sueldos de todas las personas es: "+promedio);
					} else {
						for(persona x :personas1) {
							totalsueldo=totalsueldo+x.getSueldo();
						}
						promedio=totalsueldo/personas1.length;
						System.out.println("El Promedio de sueldos de todas las personas es: "+promedio);
					}
					break;
				case 4:
					if(inserto==false) {
						for(int i=0;i<personas.length-1;i++) {
							
							if(personas[i].getEdad()<personas[i+1].getEdad()) {
								menoredad=i;
							} else  if (personas[i].getEdad()==personas[i+1].getEdad()) {
								if(personas[i].getMes()>personas[i+1].getMes()) {
									menoredad=i;
								}else if (personas[i].getMes()==personas[i+1].getMes()) {
									if(personas[i].getDia()>personas[i+1].getDia()) {
										menoredad=i;
									} else {
										menoredad=i+1;
									}
								} else {
									menoredad=i+1;
								}
							}else {
								menoredad=i+1;
							}
						}
						System.out.println("El nombre el menor de edad es: "+personas[menoredad].getNombre());
					} else {
						
						for(int i=0;i<personas1.length-1;i++) {
							
							if(personas1[i].getEdad()<personas1[i+1].getEdad()) {
								menoredad=i;
							} else  if (personas1[i].getEdad()==personas1[i+1].getEdad()) {
								if(personas1[i].getMes()>personas1[i+1].getMes()) {
									menoredad=i;
								}else if (personas1[i].getMes()==personas1[i+1].getMes()) {
									if(personas1[i].getDia()>personas1[i+1].getDia()) {
										menoredad=i;
									} else {
										menoredad=i+1;
									}
								} else {
									menoredad=i+1;
								}
							}else {
								menoredad=i+1;
							}
						}
						System.out.println("El nombre el menor de edad es: "+personas1[menoredad].getNombre());
						
					}
					break;
				case 5:
					System.out.println("fin.");
					break;
				}
				

			}
			
			
		}

	}


	class persona {
		
		String nombre;
		int cc=0 , year=0, mes=0 , dia=0,edad;
		int sueldo=0;
		
		Scanner entrada = new Scanner(System.in);
		 
		public void copiarDesde(persona otraPersona) {
		        this.nombre = otraPersona.nombre;
		        this.cc = otraPersona.cc;
		        this.sueldo = otraPersona.sueldo;
		        this.dia = otraPersona.dia;
		        this.mes = otraPersona.mes;
		        this.year = otraPersona.year;
		        this.edad = otraPersona.edad;
		    }
		public persona() {
			
		}
			
		public void asignaValores() {
			System.out.println("Escribe la identificacion de la persona nueva persona:  ");
			cc=entrada.nextInt();
			
			entrada.nextLine();
			
			System.out.println("Escribe el nombre de la persona: ");
			nombre=entrada.nextLine();
			
			System.out.println("Escribe el sueldo de la persona; ");
			sueldo=entrada.nextInt();
			
			System.out.println("Escribe el dia de nacimiento; ");
			dia=entrada.nextInt();
			
			System.out.println("Escribe el mes de nacimiento; ");
			mes=entrada.nextInt();
			
			System.out.println("Escribe el año de nacimiento; ");
			year=entrada.nextInt();
			edad();
		}


		
		public void edad() {
			edad=2023-year;
		}
		public int getEdad() {
			return edad;
		}
		public int getMes() {
			return mes;
		}
		public int getDia() {
			return dia;
		}
		public String getNombre() {
			return nombre;
		}
		public int getSueldo() {
			return sueldo;
		}
		public void getlista() {
			
			System.out.println(nombre+"\t"
					+cc+"\t"
					+sueldo+"\t"
					+dia+"/"+mes+"/"+"/"+year);
				
		}
		
		
		

		
		
		
	}
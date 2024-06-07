package Youtube;

public class Ejercicio_14 {

	public static void main(String[] args) {
		
		int a=10; 
		int i=a;
		System.out.println("a\ti\tsalida \n---------------------------");
		
		while(i<=22) {
			
			if(i==a) {
				System.out.printf("%d",a);
				
			}
			int salida=i*2;
			System.out.println("\t"+i+"\t"+salida);
					
			i+=3;
		}
		
		

	}

}

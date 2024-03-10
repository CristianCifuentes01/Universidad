package AnalisisAlgoritmos;


public class insercion {
    public static void main(String[] args) {
        
    	int[] arr = {9,8,4,3,39,5};
        
        
        for (int i = 1; i < arr.length; ++i) {
            
        	int Actual = arr[i];
            int Anterior = i - 1;
            
             while(Anterior >= 0 && arr[Anterior] > Actual) {
                
            	arr[Anterior + 1] = arr[Anterior];
            	Anterior = Anterior - 1;
            }
            
            arr[Anterior + 1] = Actual;
         
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


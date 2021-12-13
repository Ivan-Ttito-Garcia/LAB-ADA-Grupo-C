
public class TieRopes {
	
	
	/*
	 *  Se inicializa un cnotador para el retorno del metodo
	 *  Tambien una variable que nos permita acumular el tamaño
	 *  de las cuerdas.
	 *  
	 *  se recorre el arreglo uno a uno sumando cada cuerda hasta
	 *  lograr el objetivo, una vez logrado se incrementa el contador
	 *  y reiniciamos length, para buscar otras soluciones.
	 *  
	 *  Una vez recorrido todo el arreglo retornamos nuestro contador
	 */
	class Solution {
	    public int solution(int K, int[] A) {
	    	
	        int cont = 0, length = 0;
	        
	        for (int i = 0 ; i < A.length ; i++) {
	        	length += A[i];
	            if (length >= K) {
	            	length = 0;
	            	cont++; 
	            }
	        }
	        return cont;
	    }
	}
}

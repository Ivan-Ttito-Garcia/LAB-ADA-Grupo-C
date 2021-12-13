
public class MaxNonoverlappingSegments {
	
	
	/*
	 *  Primero se inicializa la variable cont, que es el resultado final.
	 *  
	 *  Luego creamos una variable que nos indique el punto final de nuestro
	 *  ultimo segmento.
	 *  
	 *  Verificamos si la lista ingresada solo tiene un elemento,
	 *  pues si es asi no sera necesario ejecutar el algoritmo.
	 *  
	 *  luego en un bucle recorremos los datos ingresados, asegurandonos
	 *  que el inicio del siguiente elemento sea posterior al final del 
	 *  elemento previo.
	 *  
	 *  Finalmente cada vez que se añade un elemento incrementamos el contador
	 *  y luego lo retornaos
	 */
	
	class Solution {
	    public int solution(int A[], int B[]) {
	    	
	    	int cont = 1;
	        int UltFin = B[0];
	        
	        if (A.length == 1)
	            return 1;
	        
	        for (int i = 1 ; i < A.length ; i++)
	            if (A[i] > UltFin) {
	            	UltFin = B[i];
	                cont++;
	            }
	        return cont;
	    }
	}
}


public class EveryOther {
	public static void main(String[] arg) {
		
		//CASO DE PRUEBA
		int[] arr = {2,3,4,5};
		everyOther(arr);
	}
	
	/*
	 Metodo que muestra la suma de los numeros de indice par
	 con cada uno de los elementos del arreglo.
	 
	 Dado que contiene un for anidado la complejidad es de O(n^2)
	 */
	public static void everyOther(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++)
			if(i % 2 == 0) {
				for(int j = 0 ; j< arr.length ; j++)
					System.out.println(arr[i]+arr[j]);
				System.out.println();
			}			
	}
}

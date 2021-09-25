
//INSERTION SORT

public class Ejercicio2 {
	public static void main(String[] arg) {
		
		long tiempoInicio;
	    long tiempoFinal;
	    
	    for(int i=20000 ; i<=200000 ; i = i+20000) {
	    	int[] arr = newArr(i);

		    tiempoInicio = System.currentTimeMillis();
		    insertionSort(arr);
			tiempoFinal = System.currentTimeMillis();
			
			//System.currentTimeMillis() mide el tiempo en milisegundos
			System.out.println("N° de datos: "+arr.length+"  Time : "+(tiempoFinal-tiempoInicio)+" ms.");
			
	    }
	}
	//Metodo que crea un arreglo de tamaño n, con numeros aleatorios 
	//desde 0 hasta 3*n
	public static int[] newArr(int n) {
		int[] arr = new int[n];
		for(int i = 0 ; i < arr.length ; i++)
			arr[i] = (int)(Math.random()*(3*n));
		return arr;
	}
	
	//Algoritmo de ordenamiento por inssercion.
	public static void insertionSort(int[] arr) {
		int key, i;
		for(int j = 1 ; j < arr.length ; j++) {
			key = arr[j];
			i = j - 1;
			while(i >= 0 && arr[i]>key) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
	}
}

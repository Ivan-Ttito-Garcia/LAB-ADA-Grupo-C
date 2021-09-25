
//BUSQUEDA SECUENCIAL..

public class Ejercicio1 {
	public static void main(String[] arg) {
		
		long tiempoInicio;
	    long tiempoFinal;
	    
	    for(int i=20000000 ; i<=200000000 ; i = i+20000000) {
	    	int[] arr = newArr(i);

		    tiempoInicio = System.currentTimeMillis();
			System.out.println(search(arr , 15));
			tiempoFinal = System.currentTimeMillis();
			
			//System.currentTimeMillis() mide el tiempo en milisegundos
			System.out.println("N° de datos: "+arr.length+"  Time : "+(tiempoFinal-tiempoInicio)+" ms.");
			
	    }
	}
	
	//Metodo que busca determinado valor dentro de un arreglo ingresado previamente.
	public static boolean search(int[] arr, int x) {
		for(int i=0 ; i<arr.length ; i++)
			if(arr[i] == x)
				return true;
		return false;
	}
	
	//Metodo que retorna un arreglo de determinado tamaño n, 
	//Y en su contenido se encuentran numeros desde n hasta 1
	public static int[] newArr(int n) {
		int[] arr = new int[n];
		for(int i = 0; n - i > 0 ; i++)
			arr[i] = n - i;
		return arr;
	}
	
	
}
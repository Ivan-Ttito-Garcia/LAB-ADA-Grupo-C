
public class DepthFirstSearch {
	
	public static void main(String[] arg) {

		String[][] arr = { {"#","#","#","#","#","#"},
						   {"#","0","0","0","0","#"},
						   {"#","0","0","0","0","#"},
						   {"#","0","0","0","0","#"},
						   {"#","0","0","0","#","0"},
						   {"#","#","#","#","0","0"} };
		
		//ARREGLO INICIAL
		ImprimirArreglo(arr);
		
		//CASO DE PRUEBA
		DFS_recursive(arr, 2, 2);
		
		//ARREGLO FINAL
		ImprimirArreglo(arr);
		
	}
	
	
	
	/*
	 * Primer metodo que hace el recorrido,
	 * Entradas:
	 * 		- arr = arreglo de prueba (malla)
	 * 		- x, y = coordenadas del punto inicial
	 * 
	 * Se establecen las condiciones de la recursion:
	 * 		- Si la posicion es 0 se modifica a 1 para marcar la visita,
	 * 		  luego recorremos sus "vecinos" con el siguiente método...
	 * 		- Si es 0 o # no hace nada y sale de la recursion.
	 */
	public static void DFS_recursive(String[][] arr, int x, int y) {
		
		
		if(arr[x][y] == "0") {
			arr[x][y] = "1";
			RecorrerVecinos(arr, x, y);
		}
		
		else
			return;
				
	}
	
	/*
	 * Este metodo es el encargado de recorrer los nodos vecinos,
	 * Entradas:
	 * 		- arr = arreglo de prueba (malla)
	 * 		- x, y = coordenadas del punto del que evaluaremos los "vecinos"
	 * 
	 * - Primero se asegura que los valores a evaluar se encuentren
	 *   dentro del rango de la malla.
	 * - Cuando nos aseguremos que las coordenadas son validas, volvemos a
	 *   llamar a la recursion, para el nuevo punto explorado.
	 * - Como vimos en el anterior metodo la recursion termina luego
	 *   de terminar la exploracion de todos los nodos posibles, osea
	 *   que ya no haya un nodo de valor 0 adyacente a alguno de los ya explorados.
	 */
	public static void RecorrerVecinos(String[][] arr, int x, int y) {
		
		if(x != 0)
			DFS_recursive(arr, x - 1, y);
		
		if(y != arr.length - 1)
			DFS_recursive(arr, x, y + 1);
		
		if(x != arr.length - 1)
			DFS_recursive(arr, x + 1, y);
		
		if(y != 0)
			DFS_recursive(arr, x, y - 1);
		
	}
	
	/*
	 * Metodo que imprime la malla (matriz).
	 */
	public static void ImprimirArreglo(String[][] arr) {
		for(String[] x : arr) {
			for(String y : x) 
				System.out.print(y+"   ");
			System.out.println();
		}
		System.out.println("\n\n\n");
	}
	
	
}

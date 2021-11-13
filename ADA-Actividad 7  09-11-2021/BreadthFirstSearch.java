import java.util.*;
public class BreadthFirstSearch {
	
	public static void main(String[] arg) {

		int[][] arr = { {-1,-1,-1,-1,-1},
						{-1,-1, 0,-1,-1},
						{-1,-1,-1,-1,-1},
						{-1,-1,-1,-1,-1},
						{-1,-1,-1,-1,-1},};
		
		//CASO DE PRUEBA
		RecorrerMalla(arr, 1, 2);
		
		//ARREGLO FINAL (CON LA CANTIDAD DE PASOS)
		ImprimirArreglo(arr);
		
	}
	
	
	/*
	 * - Este metodo es el iniciador de la recursion,
	 *   crea la estructura para llevarla al metodo principal...
	 *   
	 * - Entradas:
	 * 		- arr = arreglo de prueba (malla)
	 * 		- x, y = coordenadas del punto inicial
	 * 
	 * -En el metod principal (BFS) se usa la estructura de colas
	 * 	para que el recorrido sea en el orden de la tecnica BFS,
	 * 	por lo tanto aqui creamos 2 ArrayList uno para las coordenadas X,
	 * 	y otro para las coordenadas Y, y asi simular una cola...
	 * 
	 * -Para el metodo BFS se debe ingresar el numero de pasos hasta el momento
	 * 	por ello en la llamada al metodo se inicia en 0, pues todavia no estamos
	 *  recorriendo nada...
	 */
	public static void RecorrerMalla(int[][] arr, int x, int y) {
		
		ArrayList<Integer> ColaPosicionesX = new ArrayList<Integer>();
		ArrayList<Integer> ColaPosicionesY = new ArrayList<Integer>();
		ColaPosicionesX.add(x);
		ColaPosicionesY.add(y);
		
		BFS(arr, ColaPosicionesX, ColaPosicionesY, 0);
		
	}
	
	
	/*
	 * - Metodo principal que mediante recursion hace el recorrido BFS
	 * 
	 * - Entradas:
	 * 		- arr = arreglo de prueba (malla)
	 * 		- ArrayList x, y = Sirve como estructura de cola para mantener 
	 * 		  el orden del recorrido, se almacenan las coordenadas de los nodos.
	 * 		- pasos = contiene el número de pasos realizados hasta el momento.
	 * 
	 * - Primero se incrementa la cantidad de pasos en 1, pues ya estamos
	 * 	 haciendo otro recorrido.
	 * 
	 * - Se crea otros 2 ArrayÑist para mantener el orden de los nodos para
	 * 	 la proxima recursion.
	 * 
	 * - Verificamos si nuestra cola esta vacia ==== if(x.isEmpty()) 
	 * 
	 * - Creamos un while que recorra toda nuestra estructura de cola hasta
	 * 	 que este vacia.
	 * 
	 * - Verificamos que las coordenadas de nuestro "vecino" sean validas,
	 *   si ese vecino no ha sido visitado, osea sigue con valor -1 le asignamos
	 *   la cantidad de pasos, posteriormente almacenamos los valores de su 
	 *   coordenada en las nuevas colas, para nuestra proxima recursion.
	 *   
	 * - De la misma manera del paso anterior se recorre los 4 "vecinos",
	 *   una vez recorridos los 4eliminamos los valores de la cola, pues 
	 *   ese nodo ya esta completamente evaluado.
	 *   
	 * - Finalmente volvemos a llamar a la recursion con las nuevas colas 
	 *   formadas a lo largo de este proceso.
	 *   
	 * - El metodo termina cuando ningun nodo contenga "vecinos" sin visitar,
	 *   osea las colas de todos los nodos se encuentren vacias.
	 */
	public static void BFS(int[][] arr, ArrayList<Integer> x, ArrayList<Integer> y, int pasos) {
		
		pasos++;
		
		ArrayList<Integer> NuevaColaX = new ArrayList<Integer>();
		ArrayList<Integer> NuevaColaY = new ArrayList<Integer>();
		
		if(x.isEmpty())
			return;
		
		
		while(!x.isEmpty()) {
			
			if(x.get(0) != 0) 
				if(arr[x.get(0) - 1][y.get(0)] == -1) {
					arr[x.get(0) - 1][y.get(0)] = pasos;
					NuevaColaX.add(x.get(0) - 1);
					NuevaColaY.add(y.get(0));
				}
				
			if(y.get(0) != arr.length - 1)
				if(arr[x.get(0)][y.get(0) + 1] == -1) {
					arr[x.get(0)][y.get(0) + 1] = pasos;
					NuevaColaX.add(x.get(0));
					NuevaColaY.add(y.get(0) + 1);
				}
				
			if(x.get(0) != arr.length - 1)
				if(arr[x.get(0) + 1][y.get(0)] == -1) {
					arr[x.get(0) + 1][y.get(0)] = pasos;
					NuevaColaX.add(x.get(0) + 1);
					NuevaColaY.add(y.get(0));
				}
				
			if(y.get(0) != 0)
				if(arr[x.get(0)][y.get(0) - 1] == -1) {
					arr[x.get(0)][y.get(0) - 1] = pasos;
					NuevaColaX.add(x.get(0));
					NuevaColaY.add(y.get(0) - 1);
				}
			
			x.remove(0);
			y.remove(0);
		}
		
		BFS(arr, NuevaColaX, NuevaColaY, pasos);
		
	}
	
	
	/*
	 * Metodo que imprime la malla (matriz).
	 */
	public static void ImprimirArreglo(int[][] arr) {
		for(int[] x : arr) {
			for(int y : x) 
				System.out.print(y+"\t");
			System.out.println();
		}
		System.out.println("\n\n");
	}
}

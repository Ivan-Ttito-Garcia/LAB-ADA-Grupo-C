
public class Maxima_Area_Isla {
	
	/*
	 * - Se implemento el algoritmo explicado en la clase DepthFirstSearch.java,
	 *   los puntos generales se encuentran explicados all�, aqu� se explicaran solo
	 *   las partes adicionales o que se modificaron.
	 */
	
	public static void main(String[] arg) {

		int[][] arr = { {0,0,1,0,0,0,0,1,0,0,0,0,0},
						{0,0,0,0,0,0,0,1,1,1,0,0,0},
						{0,1,1,0,1,0,0,0,0,0,0,0,0},
						{0,1,0,0,1,1,0,0,1,0,1,0,0},
					    {0,1,0,0,1,1,0,0,1,1,1,0,0},
					    {0,0,0,0,0,0,0,0,0,0,1,0,0},
					    {0,0,0,0,0,0,0,1,1,1,0,0,0},
					    {0,0,0,0,0,0,0,1,1,0,0,0,0} };
		
		ImprimirArreglo(arr);
		
		/*
		 * - AreaMaxima ir� almacenando la cantidad de nodos de la "isla" mas grande actual.
		 * - ContadorIsla almacena el tana�o de una isla, para poder compararla con AreaMaxima.
		 * 
		 * - Como el m�todo DFS_recursive solo recorre una isla y retorna su 
		 * 	 tama�o(n�mero de nodos) los que se hace es recorrer el mapa completo
		 *   uno a uno buscando islas sin explorar(con valor 1).==> if(arr[x][y] == 1)
		 *   
		 * - Una vez encontrada una isla sin explorar se llama al metodo DFS_recursive,
		 *   almacenando en n�mero de nodos en la variable ContadorIsla,
		 *   
		 * - Luego comparamos el valor de ContadorIsla y verificamos si es mayor que
		 *   AreaMaxima, si es as�, actualizamos AreaMaxima.
		 *   
		 * - Despues volvemos ContadorIsla a 0 para poder explorar otras islas, 
		 *   de esta manera se recorre todo el "mapa" y AreaMaxima se ir� actualizando
		 *   con la "isla" mas grande hasta finalizar.
		 */
		
		int AreaMaxima = 0;
		int ContadorIsla = 0;
		
		for(int x = 0 ; x < arr.length ; x++)
			for(int y = 0 ; y < arr[x].length ; y++)
				if(arr[x][y] == 1) {
					ContadorIsla = DFS_recursive(arr, x, y, ContadorIsla);
					if(ContadorIsla > AreaMaxima)
						AreaMaxima = ContadorIsla;
					ContadorIsla = 0;
				}
		
		System.out.println("Area Maxima = "+AreaMaxima);
		ImprimirArreglo(arr);
	}
	
	/*
	 * - Como mencion� la funcionalidad es la misma que DepthFirstSearch.java,
	 * 	 solo que aqui se agreg� un contador el cual cuenta el numero de nodos
	 * 	 que conforma la "isla", retornando el valor cada vez que finaliza la
	 * 	 recursion, y asignandole ese valor a la nueva recursion, ademas va
	 *   incrementandose en 1 cada vez que se visita un nodo nuevo.
	 *   
	 * - Cada vez que se explora un nodo de la "isla" su valor cambia a 2, para
	 *   identificar los nodos visitados.
	 *   
	 * - Estos m�todos solo recorren una "isla" y al final retornan el n�mero de
	 *   nodos de esta.
	 */
	public static int DFS_recursive(int[][] arr, int x, int y, int contador) {
		
		
		if(arr[x][y] ==  1) {
			arr[x][y] = 2;
			contador++;
			contador = RecorrerVecinos(arr, x, y, contador);
		}
		
		else
			return contador;
		
		return contador;
			
	}
	
	public static int RecorrerVecinos(int[][] arr, int x, int y, int contador) {
		if(x != 0)
			contador = DFS_recursive(arr, x - 1, y, contador);
		
		if(y != arr.length - 1)
			contador = DFS_recursive(arr, x, y + 1, contador);
		
		if(x != arr.length - 1)
			contador = DFS_recursive(arr, x + 1, y, contador);
		
		if(y != 0)
			contador = DFS_recursive(arr, x, y - 1, contador);
		
		return contador;
	}
	
	
	/*
	 * Metodo que imprime la malla (matriz).
	 */
	public static void ImprimirArreglo(int[][] arr) {
		for(int[] x : arr) {
			for(int y : x) 
				System.out.print(y+"  ");
			System.out.println();
		}
		System.out.println("\n\n");
	}
}

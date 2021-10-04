
public class BusquedaMatriz {
	public static void main(String[] arg) {
		
		//CASOS DE PRUEBA
		int[][] arr = newArr(5,4);
		System.out.println(Busqueda_Matriz(arr,7)+"\n\n");
		imprimirMatriz(arr);
		
		System.out.println("\n\n");
		
		int[][] arr2 = newArr(7,3);
		System.out.println(Busqueda_Matriz(arr2,19)+"\n\n");
		imprimirMatriz(arr2);
		
	}
	
	//Metodo que busca un elemento en una matriz
	//Imprime la posicion del elementp en caso sea encontrado
	//Retorna V o F segun el caso
	/*Se reutiliza el codigo de busqueda binaria una vez se encuentre la 
	fila en el que posiblemente se encuentra el dato*/
	public static boolean Busqueda_Matriz(int[][] arr, int data) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i][arr[i].length-1] >= data) {
				
				int x = BynarySearch(arr[i], data);
				if(x != -1) {
					System.out.println("Posicion: ("+i+","+x+")");
					return true;
				}
				else
					return false;
			}
		}
		return false;
	}
	
	public static int BynarySearch(int arr[], int data){
		
		int n = arr.length;
		int inf=0, sup=n-1, centro;
		while(inf<=sup){
			centro=(sup+inf)/2;
			   
			if(arr[centro]==data)
				return centro;
			
			else if(data < arr[centro])
				sup=centro-1;
			
			else
				inf=centro+1;
		}
		System.out.println(arr[0]);
		return -1;
	}
	
	//Crea una matriz con contenido en orden numerico a partir de 1..
	public static int[][] newArr(int fila, int columna) {
		int[][] x = new int[fila][columna];
		int num = 1;
		for(int i = 0 ; i < x.length ; i++) 
			for(int j = 0 ; j < x[i].length ; j++) {
				x[i][j] = num;
				num++;
			}
		return x;
	}
	
	//Imprime una matriz.
	public static void imprimirMatriz(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

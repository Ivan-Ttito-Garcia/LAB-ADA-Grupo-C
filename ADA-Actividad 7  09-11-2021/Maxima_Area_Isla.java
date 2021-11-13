
public class Maxima_Area_Isla {
	
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
		
		
		ImprimirArreglo(arr);
		System.out.println("Area Maxima = "+AreaMaxima);
	}
	
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
	
	public static void ImprimirArreglo(int[][] arr) {
		for(int[] x : arr) {
			for(int y : x) 
				System.out.print(y+"  ");
			System.out.println();
		}
		System.out.println("\n\n");
	}
}

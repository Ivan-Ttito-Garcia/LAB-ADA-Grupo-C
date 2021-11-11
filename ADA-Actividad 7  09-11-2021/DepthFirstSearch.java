
public class DepthFirstSearch {
	
	public static void main(String[] arg) {

		String[][] arr = { {"#","#","#","#","#","#"},
						   {"#","0","0","0","0","#"},
						   {"#","0","0","0","0","#"},
						   {"#","0","0","0","0","#"},
						   {"#","0","0","0","#","0"},
						   {"#","#","#","#","0","0"} };
		
		ImprimirArreglo(arr);
		
		DFS_recursive(arr, 2, 2);
		
		ImprimirArreglo(arr);
		
	}
	
	public static void DFS_recursive(String[][] arr, int x, int y) {
		
		
		if(arr[x][y] == "0") {
			arr[x][y] = "1";
			RecorrerVecinos(arr, x, y);
		}
		
		else if(arr[x][y] == "#")
			return;
		
		else
			return;
			
	}
	
	public static void RecorrerVecinos(String[][] arr, int x, int y) {
		DFS_recursive(arr, x - 1, y);
		DFS_recursive(arr, x, y + 1);
		DFS_recursive(arr, x + 1, y);
		DFS_recursive(arr, x, y - 1);
		
	}
	
	public static void ImprimirArreglo(String[][] arr) {
		for(String[] x : arr) {
			for(String y : x) 
				System.out.print(y+"\t");
			System.out.println();
		}
		System.out.println("\n\n\n");
	}
	
	
}

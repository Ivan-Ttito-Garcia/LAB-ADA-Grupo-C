import java.util.*;
public class BreadthFirstSearch {
	
	public static void main(String[] arg) {

		int[][] arr = { {-1,-1,-1,-1,-1},
						{-1,-1, 0,-1,-1},
						{-1,-1,-1,-1,-1},
						{-1,-1,-1,-1,-1},
						{-1,-1,-1,-1,-1},};
		
		
		RecorrerMalla(arr, 1, 2);
		ImprimirArreglo(arr);
		
	}
	
	public static void RecorrerMalla(int[][] arr, int x, int y) {
		
		ArrayList<Integer> ColaPosicionesX = new ArrayList<Integer>();
		ArrayList<Integer> ColaPosicionesY = new ArrayList<Integer>();
		ColaPosicionesX.add(x);
		ColaPosicionesY.add(y);
		
		BFS(arr, ColaPosicionesX, ColaPosicionesY, 1);
		
	}
	
	public static void BFS(int[][] arr, ArrayList<Integer> x, ArrayList<Integer> y, int pasos) {
		
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
		
		BFS(arr, NuevaColaX, NuevaColaY, pasos + 1);
		
	}
	
	public static void ImprimirArreglo(int[][] arr) {
		for(int[] x : arr) {
			for(int y : x) 
				System.out.print(y+"\t");
			System.out.println();
		}
		System.out.println("\n\n");
	}
}

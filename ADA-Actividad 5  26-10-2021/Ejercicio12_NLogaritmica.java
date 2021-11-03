import java.util.Scanner;

public class Ejercicio12_NLogaritmica {
	
	public static void main(String[] arg) {
		
		/*
		 * En este algoritmo encontramos 2 for, uno dentro de otro,
		 * en el primero es lineal pues, se repite n veces,
		 * el segundo como ya vimos en los ejercicios 7 y 11 tiene
		 * complejidad de log_2(n), entonces como este se repite 
		 * n veces los multiplicamos por lo que nos quedaría
		 * una complejidad de O(n(log_2(n))
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
			for(int j = 1 ; j < n ; j = j * 2)
				System.out.println(j);
		
	}
}

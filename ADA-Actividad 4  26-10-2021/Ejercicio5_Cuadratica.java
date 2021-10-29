import java.util.*;

public class Ejercicio5_Cuadratica {

	/*
	 * Ejecutando el codigo podemos notar que cuando:
	 * n = 2 el # de sentencias es 1, cuando
	 * n = 3  "" 3
	 * n = 4  "" 6
	 * n = 5  "" 10
	 * Entonces podemos concluir que el numero de sentencias
	 * es  (n (n - 1)) / 2, por lo tanto
	 * tiene complejidad de O(n^2)
	 */
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < i ; j++)
				System.out.println(i+" , "+j);
			System.out.println();
		}
		
	}

}

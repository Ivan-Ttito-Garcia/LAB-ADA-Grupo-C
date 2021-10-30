import java.util.Scanner;

public class Ejercicio10_Lineal {
	
	public static void main(String[] arg) {
		
		/*
		 * Ene ste algoritmo podemos notar que se hace
		 * n repeticiones de la asentencia por cada for,
		 * por lo tanto sumados seria 2(n), quitando las 
		 * constantes la complejidad sería de O(n).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
			System.out.println(i);
		
		for(int j = 0 ; j < n ; j++)
			System.out.println(j);
		
	}

}

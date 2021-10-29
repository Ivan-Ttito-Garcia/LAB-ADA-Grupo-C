import java.util.*;

public class Ejercicio2_Lineal {
	
	/*
	 * La complejidad de este algoritmo es lineal, pues
	 * al igual que el anterior se recorre n elementos
	 * solo que ahora en orden inverso, entonces
	 * sería O(n)
	 */
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		for(int i = n ; i > 0 ; i--)
			System.out.println(i);
		
	}
}

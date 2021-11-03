import java.util.*;

public class Ejercicio1_Lineal {
	
	/*
	 * La complejidad de este algoritmo es lineal, pues
	 * la sentencia es repetida n veces, siendo n un numero
	 * ingresado previamente, entonces la complejidad
	 * sería O(n)
	 */
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
			System.out.println(i);
		
	}
}

import java.util.*;

public class Ejercicio3_Lineal {
	
	/*
	 * En este algoritmo se recorre n numeros, pero
	 * de dos en dos, por lo tanto se ejecutarian n/2
	 * sentencias, quitando las contantes se tendría
	 * una complejidad de O(n)
	 */
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i = i + 2)
			System.out.println(i);
		
	}

}

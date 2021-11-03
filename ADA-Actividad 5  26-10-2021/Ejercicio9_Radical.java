import java.util.Scanner;

public class Ejercicio9_Radical {
	
	public static void main(String[] arg) {
		
		/*
		 * En este algoritmo podemos notar un i inicializado en 0
		 * que se va incrementando en 1 por cada repeticion, 
		 * la condicion de salida es que i * i o i al cuadrado
		 * sea mayor que un n ingresado, entonces podemos deducir...
		 * 1ra repeticion 
		 * 0 * 0 = 0
		 * 2da 1 * 1 = 1 
		 * 3ra 2 * 2 = 4 y así sucesivamente... hasta
		 * =>		k * k > n, despejamos k:
		 * =>		k ^ 2 > n
		 * =>		k > n ^ (1 / 2)
		 * Entonces su comlpejidad sería de        O(n ^ (1 / 2))
		 *  								 	O(raiz cuadrada de n)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		for(int i = 0 ; i * i < n ; i++)
			System.out.println(i);
		
	}
}

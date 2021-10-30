import java.util.Scanner;

public class Ejercicio7_Logaritmica {
	
	public static void main(String[] arg) {
		
		/*
		 *  En el slgoritmo a medida que se ejecuta una sentencia
		 *  la variable i se multiplica por 2, y el bucle termina
		 *  cuando i es igual o mayor que un n ingresado, entonces...
		 *  i(final) = 1 * 2 * 2 * 2 * 2 ...
		 *  	          [-------------]
		 *  		          k veces
		 *  i(final) = 2 ^ k
		 *  Para salir del for, i >= n; reemplazando:
		 *  =>		2 ^ k >= n, aplicando logaritmos:
		 *  =>		k >= log 2 (n)
		 *  Entonces su comlpejidad sería de        O(log 2 (n))
		 *  								 (logaritmo en base 2 de n)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		for(int i = 1 ; i < n ; i = i * 2)
			System.out.println(i);
		
	}
	
}

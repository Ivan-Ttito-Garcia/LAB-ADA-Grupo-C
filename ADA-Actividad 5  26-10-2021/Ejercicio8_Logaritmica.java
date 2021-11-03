import java.util.Scanner;

public class Ejercicio8_Logaritmica {
	public static void main(String[] arg) {
		
		/*
		 *  En este algoritmo notamos que ahora inicialmente i 
		 *  toma el valor de un n ingresado, y este se va dividiendo 
		 *  entre 2 en cada repeticion hasta que tome un valor inferior a 1.
		 *  Suponiendo que:
		 *  K es el numero de repeticiones.
		 *  i(final) = n / 2 / 2 / 2 ...
		 *  			  [.........]
		 *  				k veces
		 *  Entonces i = n / (2 ^ k)
		 *  Para salir del for, i < 1, reemplazando:
		 *  =>    n / (2 ^ k) < 1 
		 *  =>    n < 2 ^ k
		 *  =>    log_2(n) < k
		 *  Entonces su comlpejidad sería de        O(log_2(n))
		 *  								 (logaritmo en base 2 de n)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		for(int i = n ; i >= 1 ; i = i / 2)
			System.out.println(i);
		
	}
}

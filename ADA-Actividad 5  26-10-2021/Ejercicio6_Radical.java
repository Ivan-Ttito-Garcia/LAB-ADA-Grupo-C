import java.util.*;

public class Ejercicio6_Radical {
	
	
	public static void main(String[] arg) {
		
		/*
		 * El valor de p se incrementa cada vez que se ejecuta la sentencia,
		 * comenzando en 0, luego se suma 1, luego 2, y asi
		 * entonces p se incrementaria de la forma (i(i+1))/2 = p
		 * Ahora evaluamos el for y notamos que la condicion
		 * para la salida es que p sea mayor que un n ingresado,
		 * p > n, pero ya sabemos el equivalente a p, entonces reemplazamos
		 * (i(i+1))/2 > n, podemos tomar a i como un contador pues el 
		 * valor de final de i seria igual al numero de ejecuciones de la 
		 * sentencia, simplificando las constantes quedaria que i ≈ n^(1/2)
		 * Entonces la complejidad sería de O(n^(1/2))
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		int p=0;
		
		for(int i = 1 ; p <= n ; i++) {
			p = p + i;
			System.out.println(i+" , "+p+"\n");
		}
		
	}

}

import java.util.Scanner;

public class Ejercicio11_Logaritmica {
	
	public static void main(String[] arg) {
		
		/*
		 * Como ya vimos en el ejercicio 7 la complejidad del primer for
		 * es de log_2(n), en este for se encuentra un incrementador p
		 * que inicia en 0 y se incrementa tantas veces como se ejecuto el for.
		 * El segundo for es similar solo que en vez de n se encuentra p,
		 * que se ha ido incrementando en el anterior for
		 * por lo tanto la complejidad del segundo for seria de
		 * =>		log_2(log_2(n))
		 * Para hallar la complejidad total del algoritmo sumamos los 2 for:
		 * =>		log_2(n) + log_2(log_2(n)), simplificando
		 * => 		log_2(n*log_2(n))
		 * Entonces esa seria su complejidad final
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		int p = 0;
		
		for(int i = 1 ; i < n ; i = i * 2)
			p++;
		
		for(int j = 1 ; j < p ; j = j * 2)
			System.out.println(j);
		
	}
}

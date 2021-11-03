import java.util.*;

public class Ejercicio4_Cuadratica {
	
	/*
	 * Aqui podemos apreciar un for anidado, en el 
	 * primer for se ejecuta la sentencia n veces
	 * y la sentencia es otro for que a su vez tambien
	 * ejecuta otra sentecia n veces por lo que al
	 * final la complejidad seria de O(n^2)
	 */
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
			for(int j = 0 ; j < n ; j++)
				System.out.println(i+" , "+j);
		
	}
}

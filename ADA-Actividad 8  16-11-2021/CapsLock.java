import java.util.*;

public class CapsLock {
	
	public static void main(String[] arg) {
		Deque<String> stack = new ArrayDeque<String>();
		
		//Caso de prueba
		String input = "abc$d@ef$@g$";
		
		/*
		 * Implementacion del algoritmo:
		 * Se crea la variable output que ira almacenando la cadena formada
		 * cada vez que se vacia el bufer, mayus se actualiza cada vez que 
		 * haya un @ para ver si el bufer sera en mayusculas o minusculas.
		 */
		String output = "";
		boolean mayus = false;
		
		for(int i = 0 ; i < input.length() ; i++) {
			
			String x = String.valueOf(input.charAt(i));
			
			if(x.contentEquals("$"))
				output += vaciarBufer(stack, mayus);
			else if(x.contentEquals("@"))
				mayus = !mayus;
			else
				stack.offer(x);
			
		}
		
		//Salida
		System.out.println(output);
		
	}
	
	/*
	 * Cada vez que se vaya a vaciar el bufer se llamara a este metodo,
	 * se ingresa previamente el valor de mayus, para ver si debemos 
	 * retornar en mayusculas o minusculas.
	 */
	public static String vaciarBufer(Deque<String> stack, boolean mayus) {
		
		String aux = "";
		
		while(!stack.isEmpty()) 
				aux += stack.poll();
		
		if(mayus)
			return aux.toUpperCase();
		else
			return aux;
		
	}
}

import java.util.*;

public class MinimumAddToMakeParenthesesValid {
	
	public static void main(String[] arg) {
		
		Deque<String> stack = new ArrayDeque<String>();
		
		//Casos de prueba..
		//String aux = "())";
		//String aux = "(((";
		//String aux = "(()))(";
		String aux = "()))((";
		
		//Implementacion del algoritmo: Se inserta y evalua los elementos uno a uno...
		for(int i = 0 ; i < aux.length() ; i++) {
			stack.push(String.valueOf(aux.charAt(i)));
			evaluar(stack);
		}
		
		//Salida
		System.out.println("Output = "+stack.size());
	}
	
	/*
	 * Este metodo evalua si algun parentesis cerrado tiene uno abierto anteriormente,
	 * si es asi elimina los dos parentesis, caso contrario no sucede nada.
	 */
	public static void evaluar(Deque<String> stack) {
		
		if(stack.peek().equals(")") && stack.size() != 1) {
			String aux = stack.pop();
			if(stack.peek().equals("("))
				stack.pop();
			else
				stack.push(aux);
		}
		
	}
}

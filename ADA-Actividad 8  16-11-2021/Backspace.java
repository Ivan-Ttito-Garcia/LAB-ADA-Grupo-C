import java.util.*;

public class Backspace {
	
	public static void main(String[] arg) {
		
		Deque<String> stack = new ArrayDeque<String>();
		
		//Caso de prueba
		String input = "abc#de##f#ghi#jklmn#op#";
		
		//Implementacion del algoritmo...
		for(int i = 0 ; i < input.length() ; i++) {
			
			String x = String.valueOf(input.charAt(i));
			
			if(x.contentEquals("#"))
				stack.removeLast();
			else
				stack.offerLast(x);
			
		}
		
		System.out.print("Output = ");
		
		//Resultado
		while(!stack.isEmpty())
			System.out.print(stack.pollFirst());
		
	}
}

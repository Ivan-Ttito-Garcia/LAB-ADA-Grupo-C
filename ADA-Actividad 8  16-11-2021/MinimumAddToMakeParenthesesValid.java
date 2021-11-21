import java.util.*;

public class MinimumAddToMakeParenthesesValid {
	
	public static void main(String[] arg) {
		
		Deque<String> stack = new ArrayDeque<String>();
		
		//String aux = "())";
		//String aux = "(((";
		//String aux = "(()))(";
		String aux = "()))((";
		
		for(int i = 0 ; i < aux.length() ; i++) {
			stack.push(String.valueOf(aux.charAt(i)));
			evaluar(stack);
		}
		
		System.out.println("Resultado = "+stack.size());
	}
	
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

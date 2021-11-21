import java.util.*;

public class CapsLock {
	
	public static void main(String[] arg) {
		Deque<String> stack = new ArrayDeque<String>();
		
		String input = "abc$d@ef$@g$";
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
		
		System.out.println(output);
		
	}
	
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

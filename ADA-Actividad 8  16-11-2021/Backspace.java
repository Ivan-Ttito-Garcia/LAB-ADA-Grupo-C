import java.util.*;

public class Backspace {
	
	public static void main(String[] arg) {
		
		Deque<String> stack = new ArrayDeque<String>();
		
		String input = "abc#de##f#ghi#jklmn#op#";
		
		for(int i = 0 ; i < input.length() ; i++) {
			
			String x = String.valueOf(input.charAt(i));
			
			if(x.contentEquals("#"))
				stack.removeLast();
			else
				stack.offer(x);
			
		}
		
		while(!stack.isEmpty())
			System.out.print(stack.poll());
		
	}
}

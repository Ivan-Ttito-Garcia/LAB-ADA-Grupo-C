import java.util.*;

public class EvaluateReversePolishNotation {
	
	public static void main(String[] arg) {
		
		Deque<String> stack = new ArrayDeque<String>();
		
		//String[] aux = {"4","13","5","/","+"};
		//String[] aux = {"2","1","+","3","*"};
		String[] aux = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		
		for(String x : aux) {
			stack.push(x);
			evaluar(stack);
		}
		
		
		int resultado = Integer.parseInt(stack.pop());
		
		System.out.println("Resultado = "+resultado);
	}
	
	public static void evaluar(Deque<String> stack) {
		
		if(stack.peek()=="+" || stack.peek()=="-" || stack.peek()=="*" || stack.peek()=="/") {
			
			String signo = stack.pop();
			
			int op1 = Integer.parseInt(stack.pop());
			int op2 = Integer.parseInt(stack.pop());
			
			if(signo=="+") 
				stack.push(""+(op2+op1));
				
			if(signo=="-") 
				stack.push(""+(op2-op1));
			
			if(signo=="*") 
				stack.push(""+(op2*op1));
			
			if(signo=="/") 
				stack.push(""+(op2/op1));
			
		}
		
	}

}

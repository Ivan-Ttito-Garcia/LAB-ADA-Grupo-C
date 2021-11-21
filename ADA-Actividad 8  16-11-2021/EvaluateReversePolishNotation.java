import java.util.*;

public class EvaluateReversePolishNotation {
	
	public static void main(String[] arg) {
		
		Deque<String> stack = new ArrayDeque<String>();
		
		
		/*
		 * Los casos de prueba se guardaron en arreglos para no tener que insertar los valores
		 * uno a uno a la hora de ejecutar el programa, solo se hizo por motivos de facilidad...
		 */
		
		//Casos de prueba
		//String[] aux = {"4","13","5","/","+"};
		//String[] aux = {"2","1","+","3","*"};
		String[] aux = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		
		
		/*
		 * Ejecucion del algoritmo: Se inserta uno a uno los elementos y
		 * se va evaluando a lo largo del proceso...
		 */
		for(String x : aux) {
			stack.push(x);
			evaluar(stack);
		}
		
		//RESULTADO: Output
		int resultado = Integer.parseInt(stack.pop());
		System.out.println("Output = "+resultado);
	}
	
	/*
	 * Este metodo es el encargado de operar los elemento cada vez que se encuentre
	 * un signo... Se hace la respectiva operacion y se almacena el resultado.
	 */
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

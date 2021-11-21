import java.util.*;

public class InterviewWait {
	
	public static void main(String[] arg) {
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		//Caso de prueba
		int[] input = {4,-1,5,2,3};
		
		//Implementacion del algoritmo...
		int output = 0;
		for(int x : input)
			deque.offerLast(x);
		
		//Se compara almacenando el resultado de la suma hasta que uno de los extremos sea -1.
		while(deque.getFirst() != -1 && deque.getLast() != -1) {
			if(deque.getFirst() > deque.getLast())
				output += deque.removeLast();
			
			else
				output += deque.removeFirst();
		}
		
		//Resultado
		System.out.println("Output = "+output);
		
	}
}

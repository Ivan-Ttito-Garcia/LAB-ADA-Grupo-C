import java.util.*;

public class InterviewWait {
	
	public static void main(String[] arg) {
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		int[] input = {4,-1,5,2,3};
		int output = 0;
		for(int x : input)
			deque.offerLast(x);
		
		while(deque.getFirst() != -1 && deque.getLast() != -1) {
			if(deque.getFirst() > deque.getLast())
				output += deque.removeLast();
			
			else
				output += deque.removeFirst();
		}
		
		System.out.println("Output = "+output);
		
	}
}

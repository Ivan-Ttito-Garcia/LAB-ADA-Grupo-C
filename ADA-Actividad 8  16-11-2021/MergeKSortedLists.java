import java.util.*;

public class MergeKSortedLists {
	
	public static void main(String[] arg) {
		
		//CASO DE PRUEBA
		int[][] input = {{1,4,5},{1,3,4},{2,6}};
		
		/*
		 * Se intento hacer el ejercicio con la clase PriorityQueue; sin embargo
		 * por alguna razon no ordena los numeros correctamente, incluso se agregó
		 * otro comparador como atributo(comparator), pensando que era el problema,
		 * pero de igual manera no funcionaba.
		 * 
		 * El intento se encuentra en el comentario de abajo...
		 */
		
		/*
		Comparator<Integer> comparator = new NumberComparator();
		PriorityQueue<Integer> queque = new PriorityQueue<Integer>(comparator);
		
		for(int[] x : input)
			for (int y : x ) 
				queque.offer(y);
			
		
		System.out.println(queque);
		*/
		
		
		
		/*
		 * Dado que no pudimos realizar el ejercicio con PriorityQueue se implementó
		 * el ejercicio con arrayList, simulando una cola de prioridad.
		 */
		ArrayList<Integer> queque = new ArrayList<Integer>();
		for(int[] x : input)
			for (int y : x ) 
				if(queque.isEmpty())
					queque.add(y);
				else 
					insertar(queque, y);
			
		
		System.out.println("Arr = "+queque);

	}
	
	/*
	 * Este metodo ordena el elemento insertado en el lugar indicado segun su 
	 * orden, s requiere ingresar la cola y el elemento a insertar.
	 */
	public static void insertar(ArrayList<Integer> queque, int element) {
		for(int i = 0 ; i < queque.size() ; i++){
			if(i == queque.size()-1) {
				queque.add(element);
				return;
			}
			
			if(queque.get(i) >= element) {
				queque.add(i, element);
				return;
			}
			
		}
	}
}

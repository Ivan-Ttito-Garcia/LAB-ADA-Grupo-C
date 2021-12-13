import java.util.*;

public class BankQueue {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Capturamos los datos
		int NumPersonas = scan.nextInt();
		int tiempo = scan.nextInt();

		ArrayList<Integer>[] bank = new ArrayList[tiempo];
		
		//Creamos un arrayList por cada minuto hasta cerrar el banco
		for (int i = 0; i < bank.length; i++)
		    bank[i] = new ArrayList<>();

		while (NumPersonas-- > 0){
			
			//Añadimos los datos de todas las personas en bank.
		    int dinero = scan.nextInt();
		    int tiempoEnSalir = scan.nextInt();
		    bank[tiempoEnSalir].add(dinero);
		    
		    }

		int total = 0;

		ArrayList<Integer> opciones = new ArrayList<Integer>();
		
		/*
		 * Recorremos los tiempos de forma inversa para elegir la meyor opcion
		 * sin correr el riesgo de que la persona ya se haya ido.
		 */
		for (int i = tiempo - 1 ; i >= 0 ; i--){
			
			//Añadimos todas las opciones posibles segun el tiempo especificado.
			opciones.addAll(bank[i]);
		    
		    //Ordenamos las opciones ascendentemente.
		    Collections.sort(opciones);
		    
		    /*
		     * Elegimos la de mayor precio, osea la que esta al final de la
		     * lista, y la sumamos a nuestro total.
		     */
		    if (!opciones.isEmpty())
		        total += opciones.remove(opciones.size() - 1);
		    }
		
		//Imprimimos el total
		System.out.println(total);

    }
}


public class GreatestNumber {
	public static void main(String[] arg) {
		
		//CASO DE PRUEBA
		int[] arr = {5,6,2,7,9,0};
		System.out.println(greatestNumber(arr));
		
 	}
	
	//Método que recibe un arreglo y retorna el mayor de sus elementos...
	//La comlplejidad del algoritmo es lineal, pues se recorre el
	//arreglo una sola vez y las sentencias dentro del for tambien 
	//tienen una complejidad lineal, entonces: quitandlo las constantes
	//sería de O(n)
	
	public static int greatestNumber(int[] arr) {
		int mayor = arr[0];
		for(int i = 1 ; i <arr.length ; i++)
			if(arr[i] > mayor)
				mayor = arr[i];
		return mayor;
	}
}

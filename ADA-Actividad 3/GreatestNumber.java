
public class GreatestNumber {
	public static void main(String[] arg) {
		
		//CASO DE PRUEBA
		int[] arr = {5,6,2,7,9,0};
		System.out.println(greatestNumber(arr));
		
 	}
	
	//Método que recibe un arreglo y retorna el mayor de sus elementos...
	public static int greatestNumber(int[] arr) {
		int mayor = arr[0];
		for(int i = 1 ; i <arr.length ; i++)
			if(arr[i] > mayor)
				mayor = arr[i];
		return mayor;
	}
}

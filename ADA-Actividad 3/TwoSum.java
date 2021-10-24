
public class TwoSum {
	public static void main(String[] arg) {
		
		//CASO DE PRUEBA
		int[] arr = {2,3,5,4,6};
		System.out.println(twoSum(arr));
	}
	
	/*
	 Metodo que recibe un arreglo y retorna true o false
	 dependiendo si la suma de 2 terminos de diferente 
	 posicion en el arreglo suman 10
	 
	 En el algoritmo podemos apreciar un for anidado lo que
	 nos dara una complejidad de O(n^2)
	 */
	public static boolean twoSum(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++)
			for(int j = 0 ; j < arr.length ; j++)
				if( (i != j) && (arr[i] + arr[j] == 10))
					return true;
		return false;
	}

}

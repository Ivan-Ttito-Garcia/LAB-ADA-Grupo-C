
public class Binary_Search {
	
	public static void main(String[] arg) {
		
		//CASO DE PRUEBA
		int[] arr = {2,5,9,11,15,20,32,41,45,50,55,61,80};
		System.out.println("==> "+BinarySearch(arr,141));
		
	}
	
	//Implementación  de codigo del algoritmo de busqueda binaria
	public static int BinarySearch(int[] arr, int targed) {
		
		int l = 0;
		int r = arr.length - 1;
		
		int mid;
		
		while (l <= r) {
			
			mid = l + (r - l) / 2;
			
			if ( arr[mid] == targed )
				return mid;
			
			else if ( arr[mid] < targed )
				l = mid + 1;
			
			else 
				r = mid-1;
			
		}
		
		return -1;
	}
	
}

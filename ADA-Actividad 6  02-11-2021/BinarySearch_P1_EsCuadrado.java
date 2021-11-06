
public class BinarySearch_P1_EsCuadrado {
	
	public static void main(String[] arg) {
		
		//CASO DE PRUEBA
		System.out.println("==> "+EsCuadrado(169));
		
	}
	
	/*
	 * Algoritmo que comprueba si un numero es o no un cuadrado,
	 * haciendo uso de busqueda binaria.
	 */
	public static boolean EsCuadrado(int targed) {
		
		int l = 0;
		int r = targed;
		
		int mid;
		
		while (l <= r) {
			
			mid = l + (r - l) / 2;
			
			if ( mid * mid == targed )
				return true;
			
			else if ( mid * mid < targed )
				l = mid + 1;
			
			else 
				r = mid-1;
			
		}
		return false;
	}
}

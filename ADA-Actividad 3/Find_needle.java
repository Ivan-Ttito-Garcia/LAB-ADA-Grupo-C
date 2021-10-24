
public class Find_needle {
	public static void main(String[] arg) {
		String st1 = "abcdefghi";
		
		//CASO DE PRUEBA
		System.out.println(find_needle("fgh", "abcdefghi"));
		
	}
	
	/*
	 Metodo que retorna true o false si una cadena ingresada forma parte
	 de una subcadena de otra cadena ingresada.
	 
	 n = longitud de la cadena $haystack
	 m = longitud de la cadena $needle
	 Para buscar la subcadena dada se recorre toda la cadena $haystack.
	 A su vez en el peor de los casos tendremos que recorrer la cadena
	 $needle uno a uno en cada carater de $haystack, pero no recorreremos
	 la cadena completa, ya que se encontraria la subcadena y 
	 retornaria true, por lo que se recorrería m-1(para que no se complete la subcadena) veces n.
	 Asi que en el peor de los casos la complejidad del algoritmo
	 sería de O(n(m-1)) 
	  */
	public static boolean find_needle(String needle, String haystack) {
		boolean found_needle;
		int needle_index = 0;
		int haystack_index = 0;
		
		while(haystack_index < haystack.length()) {
			if(needle.charAt(needle_index) == haystack.charAt(haystack_index)) {
				found_needle = true;
				while(needle_index < needle.length()) {
					if(needle.charAt(needle_index) != haystack.charAt(needle_index + haystack_index)) {
						found_needle = false;
						break;
					}
					needle_index++;
				}
				if(found_needle)
					return true;
			}
			needle_index = 0;
			haystack_index++;
		}
		return false;
	}
}

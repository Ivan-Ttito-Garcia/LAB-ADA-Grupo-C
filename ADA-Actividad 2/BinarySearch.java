
public class BinarySearch {
	
	public static void main(String[] arg) {
		
		//CASOS DE PRUEBA
		System.out.println("Caso 1:");
		int[] arr = newArr(100);
		System.out.println(BynarySearch(arr, 26)+"\n\n");
		
		System.out.println("Caso 1:");
		int[] arr2 = newArr(10000);
		System.out.println(BynarySearch(arr2, 245));
		 
	}
	
	//Metodo de busqueda binaria.
	/*Imprime la posicion del elemento encontrado, 
	además del numero de busquedas que se utilizó.*/
	public static boolean BynarySearch(int arr[], int data){
		
		int n = arr.length;
		int inf=0, sup=n-1, centro;
		int cont=0;
		while(inf<=sup){
			cont++;
			centro=(sup+inf)/2;
			   
			if(arr[centro]==data){
				System.out.println("Posicion :"+centro+"\t N° de busquedas :"+cont);
				return true;
			}
			
			else if(data < arr[centro])
				sup=centro-1;
			
			else
				inf=centro+1;
		}
		System.out.println("No se encontro el valor, N° de busquedas :"+cont);
		return false;
	}
	
	//Metodo que crea un arreglo que tiene el valor de su indice como contenido
	public static int[] newArr(int n) {
		int[] x = new int[n];
		for(int i = 0 ; i < x.length ; i++) {
			x[i] = i;
		}
		return x;
	}
}

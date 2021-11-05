
public class BinarySearch_P3_ArrayRotado {
	
	public static void main(String[] arg) {
		
		int[] arr = {11,15,20,32,41,45,50,55,60,2,3,4,5,6,7,8,9};
		System.out.println("==> "+BuscarMenor(arr));
		
	}
	
	public static int BuscarMenor(int[] arr) {
		
		int l = 0;
		int r = arr.length - 1;
		int mid, menor = arr[0];
		
		while (l <= r) {
			
			mid = l + (r - l) / 2;
			
			if(arr[mid] == arr[r])
				return menor;
			
			if ( arr[mid] > arr[r] )
				l = mid + 1;
			
			else if ( arr[mid] < arr[r] )
				r = mid - 1;
			
			if(menor > arr[mid])
				menor = arr[mid];
			if(menor > arr[l])
				menor = arr[l];
		}
		
		return menor;
		
	}
}

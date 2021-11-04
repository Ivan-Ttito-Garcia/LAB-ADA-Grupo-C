
public class BinarySearch_P2_MayorIgual {
	
	public static void main(String[] arg) {
		
		int[] arr = {2,5,9,11,15,20,32,41,45,50,55,61,80};
		System.out.println(PrimerMayorOIgual(arr, 25));
		
	}
	
	public static int PrimerMayorOIgual(int[] arr, int targed) {
		
		int l = 0;
		int r = arr.length - 1;
		
		int mid = 0;
		
		if(arr[arr.length - 1] < targed)
			return -1;
		
		while (l <= r) {
			
			mid = l + (r - l) / 2;
			
			if ( arr[mid] == targed )
				return arr[mid];
			
			else if ( arr[mid] < targed )
				l = mid + 1;
			
			else 
				r = mid-1;
			
		}

		if(arr[mid] > targed)
			return arr[mid];
		else
			return arr[mid+1];
	
	}
}

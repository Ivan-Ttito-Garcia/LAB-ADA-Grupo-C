
public class RectangleCutting {
	
	public static void main(String arg[]) {
		
		System.out.println(cortar(5, 8, 0));
		
	}
	public static int cortar(int a, int b, int NumeroCortesAux) {
		
		int NumeroCortes = NumeroCortesAux;
		
		if(a > b) {
			NumeroCortes++;
			NumeroCortes = cortar(a-b, b, NumeroCortes);
		}
		else if(a < b) {
			NumeroCortes++;
			NumeroCortes = cortar(a, b-a, NumeroCortes);
			
		}
		
		return NumeroCortes;
		
	}
}

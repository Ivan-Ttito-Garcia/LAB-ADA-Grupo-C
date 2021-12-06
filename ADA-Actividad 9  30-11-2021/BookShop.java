
public class BookShop {
	public static void main(String[] arg) {
		int NumeroDeLibros = 4;
		int precioMaximo = 10;
		
		int[] precios = {4,8,5,3};
		int[] paginas = {5,12,8,1};
		
		int  MaximoDePaginas = Mochila(NumeroDeLibros, precioMaximo, precios, paginas);
		
		System.out.println("Maximo de paginas: "+MaximoDePaginas);
		
	}
	public static int Mochila(int NumeroDeLibros, int precioMaximo, int[] precios, int[] paginas){   
		
		int[][]  matriz_mochila = new int[NumeroDeLibros+1][precioMaximo+1];       
		
		for(int j = 1; j <= NumeroDeLibros ; j++)
			for(int c = 1; c <= precioMaximo; c++)
				
				if(c <  precios[j-1] )      
					matriz_mochila[j][c] = matriz_mochila[j-1][c];   
					
				else          
					if(matriz_mochila[j-1][c] > matriz_mochila[j-1][c-precios[j-1]]+ paginas[j-1])
						matriz_mochila[j][c] = matriz_mochila[j-1][c];           
					else           
						matriz_mochila[j][c] = matriz_mochila[j-1][c-precios[j-1]]+paginas[j-1];         
			
		
		return matriz_mochila[NumeroDeLibros][precioMaximo];    
	}
}


public class UniquePathII {

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int[][] aux = new int[obstacleGrid.length][obstacleGrid[0].length];
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		for(int i = 0 ; i < m ; i++)
			for(int j = 0 ; j < n ; j++)
				
				if(obstacleGrid[i][j] == 1)
					continue;
		
				else {
					if(i == 0 && j == 0)
						aux[i][j] = 1;
					
					if(i > 0 && j > 0)
						aux[i][j] = aux[i][j-1]+aux[i-1][j];
					
					if(i > 0 && j == 0)
						aux[i][j] = aux[i-1][j];
					
					if(i == 0 && j > 0)
						aux[i][j] = aux[i][j-1];
					
				}
		for(int[] x : aux) {
			for(int y : x)
				System.out.print(y+"   ");
			System.out.println();
		}
		return aux[m-1][n-1];
		
	}
}

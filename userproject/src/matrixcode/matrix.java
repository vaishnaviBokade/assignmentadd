package matrixcode;

public class matrix 
	{
	    public static void main(String[] args)
	    {
	        int a = 10, b= 10;
	
	        int[][] grid = { 
	        	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 1, 0, 0, 0, 1, 0 },
	            { 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
	            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 0, 1, 1, 0, 0, 0 },
	            { 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
	            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
	        };
	  
	        System.out.println("Original Generation");
	        for (int i = 0; i < a; i++)
	        {
	            for (int j = 0; j < b; j++)
	            {
	                if (grid[i][j] == 0)
	                    System.out.print("D");
	                else
	                    System.out.print("L");
	            }
	            System.out.println();
	        }
	        System.out.println();
	        nextGeneration(grid, a, b);
	    }
	  
	    
	    static void nextGeneration(int grid[][], int a, int b)
	    {
	        int[][] next = new int[a][b];
	  
	     
	        for (int l = 1; l < a - 1; l++)
	        {
	            for (int m = 1; m < b - 1; m++)
	            {
	               
	                int aliveNeighbours = 0;
	                for (int i = -1; i <= 1; i++)
	                    for (int j = -1; j <= 1; j++)
	                        aliveNeighbours = aliveNeighbours  + grid[l + i][m + j];
	  
	              
	                aliveNeighbours -= grid[l][m];
	  
	                // Implementing the condition
	  
	                // 1 condition
	                if ((grid[l][m] == 1) && (aliveNeighbours < 2))
	                    next[l][m] = 0;
	  
	                // 2 condition
	                else if ((grid[l][m] == 1) && (aliveNeighbours > 3))
	                    next[l][m] = 0;
	  
	                // 3 condition
	                else if ((grid[l][m] == 0) && (aliveNeighbours == 3))
	                    next[l][m] = 1;
	  
	                // 4 condition
	                else
	                    next[l][m] = grid[l][m];
	            }
	        }
	  
	        System.out.println("Next Generation");
	        for (int i = 0; i < a; i++)
	        {
	            for (int j = 0; j < b; j++)
	            {
	                if (next[i][j] == 0)
	                    System.out.print("D");
	                else
	                    System.out.print("L");
	            }
	            System.out.println();
	        }
	    }
	}




public class A16_MultiDimensionalArray {

	public static void main(String[] args) {
		
		int[] values = {3,5,2343};
		
		System.out.println(values[2]);
		
		int[][] grid = {
				{3,5,2343},
				{2,3},
				{0,2,4,6}
		};
		
		System.out.println(grid[1][1]);
		
		String[][] text = new String[2][3];
		
		text[0][1] ="hello there";
		
		System.out.println(text[0][1]);
		
		for(int row=0; row < grid[row].length;row++){
			for(int col=0; col<grid[row].length; col++){	
				System.out.print(grid[row][col]+"\t");
			}
			System.out.println();
		}
			
	}

}

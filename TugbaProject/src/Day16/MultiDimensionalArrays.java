package Day16;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		

		int[] apple= {3,4,5};
		int [] milk = {3,3,3};
		int [] meat = {4,5,4};
		int [] bread= {1,1,2};
		
		int[][] items= {
				{3,4,5},
				{3,3,3},
				{4,5,4},
				{1,1,2},
		};
		
		System.out.println("\n2D Array--------");
		
		for(int row=0; row<items.length; row++) {
			for(int col=0; col<items[row].length;col ++) {
		
		System.out.println(row+"-" + col + "=" +items[row][col]);
		}
			System.out.println();
	}
}
}

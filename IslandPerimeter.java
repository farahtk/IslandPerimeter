public class IslandPerimeter {
	public static void main(String args[]){
		IslandPerimeter testIP = new IslandPerimeter();
		testIP.testIslandPerimeter();
	}
	//tests the island Perimeter function
	void testIslandPerimeter(){
		System.out.println(islandPerimeter(new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}})); //16
	}
	
	//
	int islandPerimeter(int[][] grid) {
		int count =0;
		if (grid == null || grid.length==0 || grid[0].length==0) return count;
		
		for (int i=0; i<grid.length; i++)
			for (int j=0; j<grid[0].length; j++){
				if (grid[i][j]==1){
          //adding all 4 sides for every 1 in the island for the land
					count+=4;
					if (i > 0 && grid[i-1][j] == 1) 
            //for every connection of land on the left side of current block, reduce perimeter by 2
            count -= 2;
          if (j > 0 && grid[i][j-1] == 1) 
            // for every connection of land on the top of current block, reduce perimeter by 2
            count -= 2;
				}
			}
        return count;
    }
}

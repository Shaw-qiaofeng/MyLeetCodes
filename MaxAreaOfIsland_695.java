class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                
                if(grid[i][j] == 1){
                    max = Math.max(area(grid,i,j),max);
                }
            }
        }
        return max;
    }

    private int area(int[][] grid, int i, int j){
        if((i < 0)||(i > grid.length - 1)||(j < 0)||(j > grid[0].length - 1)||(grid[i][j] == 0)){
            return 0;
        }
        grid[i][j] = 0;
        return 1+area(grid,i-1,j)+area(grid,i+1,j)+area(grid,i,j-1)+area(grid,i,j+1);
    }
}
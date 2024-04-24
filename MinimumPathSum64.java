class Solution {
    public int minPathSum(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i-1>=0&&j-1>=0){
                    grid[i][j] = min(grid[i-1][j]+grid[i][j],grid[i][j-1]+grid[i][j]);
                }else if(i-1<0&&j-1>=0){
                    grid[i][j] = grid[i][j]+grid[i][j-1];
                }else if(j-1<0 && i-1>=0){
                    grid[i][j] = grid[i][j]+grid[i-1][j];
                }else{
                    continue;
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
    public int min(int a,int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
}

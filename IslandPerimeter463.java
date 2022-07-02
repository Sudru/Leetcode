public class IslandPerimeter463 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,0}};
        System.out.println(islandPerimeter(grid));
    }
    public static int islandPerimeter(int[][] grid) {
        int perm =0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               int s = 0;
                if(grid[i][j]==1){
                    s= 4;
                    if(j-1>=0 && grid[i][j-1]==1){
                        s--;
                    }
                    if(j+1<grid[i].length && grid[i][j+1]==1){
                        s--;
                    }
                    if(i-1>=0 && grid[i-1][j]==1){
                        s--;
                    }
                    if(i+1<grid.length && grid[i+1][j]==1){
                        s--;
                    }
                }
                perm +=s;

            }
        }
        return perm;
    }
}

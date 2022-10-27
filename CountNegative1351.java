public class CountNegative1351 {
    public static void main(String[] args) {
        int grid[][] = {{4,3,2,1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    
    public static int countNegatives(int[][] grid) {
        int count =0;
        for(int i=0;i<grid.length;i++){
            int l =0,r=grid[0].length-1,mid;
            if(grid[i][0]<0){
                count += grid[0].length;
                continue;
            }
            if(grid[i][r]>=0){
                continue;
            }
            while(l<=r){
                mid =(l+r)/2;
                if(grid[i][mid]<0 && grid[i][mid-1]>=0){
                    count += grid[i].length-mid;
                    break;
                }else if(grid[i][mid]>=0){
                    l = mid +1;
                }else{
                    r = mid -1;
                }
            }
            System.out.println("count: "+count);
        }
        return count;
    }
}

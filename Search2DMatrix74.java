public class Search2DMatrix74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] m2 = {{1},{3},{5}};
        System.out.println(searchMatrix(matrix,30));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        if(matrix[0][0]>target || target>matrix[matrix.length-1][matrix[0].length-1])
            return false;
        for(int i=0;i<matrix.length;i++){
            System.out.println(matrix[i][0]);
           if(matrix[i][0]==target)
                return true;
            else if(matrix[i][0]>target){
                row = i-1;
                break;
            }
        }
        if(matrix[matrix.length-1][0]<target){
            row = matrix.length-1;
        }   
        System.out.println(row);
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[row][i]==target)
                return true;
        }
        return false;
    }
}

import java.util.Arrays;

public class MaxCoinsYouCanGet1561 {
    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(piles));
        
    }
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int left=0,right = piles.length-2;
        int sum = 0;
        while(left<right){
            sum+=piles[right];
            right-=2;
            left+=1;
        }
        return sum;
    }
}

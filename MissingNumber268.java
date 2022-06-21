public class MissingNumber268{
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,3}));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int actualSum = (n*(n+1))/2;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
        }
        return actualSum-sum;
    }
}
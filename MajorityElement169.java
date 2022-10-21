import java.util.Arrays;

public class MajorityElement169 {
    public static void main(String[] args) {
        int[] nums = {3,3,4};
        for(int a:nums){
            System.out.print(a+" ");
        }
        System.out.println("ans: "+majorityElement(nums));
        
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count,max = 0,element = nums[0];
        count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                count = 1;
            }
            else {
                count++;
                if(count>max){
                    max = count;
                    element = nums[i];
                }
            }
           

        }
        return element;
    }
}

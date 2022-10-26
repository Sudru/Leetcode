import java.util.Arrays;

public class SpecialArray1608 {
    public static void main(String[] args) {
        int[] nums = {2,3,0,2};
        System.out.println(specialArray(nums));
        
    }
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=nums[0]){
            return nums.length;

        }
        int l =0,r=nums.length-1,mid,dist;
        while(l<=r){
            mid = (l+r)/2;
            dist = nums.length - mid;
            if(nums[mid]==dist && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }else if(nums[mid]>dist){
                if(dist>nums[mid-1]){
                    return dist;
                }
                r = mid -1;
            }else{
                l = mid +1;
            }
        }
        return -1;
    }
}

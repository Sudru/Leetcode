public class RemoveElement27 {

    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        

        System.out.println(rem(nums, 2));
        for(int i: nums)
            System.out.print(i);
    }

    public static int rem(int[] nums,int val){
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

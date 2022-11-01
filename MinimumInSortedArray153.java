public class MinimumInSortedArray153 {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1,mid=0;
        if(nums[0]>nums[nums.length-1]){
            while(l<=r){
                mid = l + (r-l)/2;
                if(mid>0 &&nums[mid]<nums[mid-1]){
                    break;
                }else if(nums[mid]<nums[nums.length-1]){
                    r = mid-1;
                }else{
                    l = mid +1;
                }
            }
            return nums[mid];
        }else{
            return nums[0];
        }
        
        
    }
}

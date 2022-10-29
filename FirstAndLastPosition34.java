public class FirstAndLastPosition34 {
    public static void main(String[] args) {
        int nums[] ={2,2};
        int ans[] = searchRange(nums, 2);
        for(int i:ans){
            System.out.print(i+" ");
        } 
    }
    public static int[] searchRange(int[] nums, int target) {
        int l =0,r=nums.length-1,mid;
        int ans[] = {-1,-1};
        while(l<=r){
            mid = l + (r-l)/2;
            if(mid == 0 && nums[mid]==target){
                ans[0] =0;
                while(mid<nums.length && nums[mid]==target){
                    mid++;
                }
                ans[1]=mid-1;   
                break;
            }
            if(nums[mid]==target && nums[mid-1]!=target){
                ans[0] = mid;
                while( mid<nums.length && nums[mid]==target){
                    mid++;
                }
                ans[1]=mid-1;   
                break;             
            }else if(nums[mid]<target){
                l = mid+1;
            }else{
                r=mid-1;
            }
            
        }
        return ans;
        
    }
}

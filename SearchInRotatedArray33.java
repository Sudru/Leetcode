public class SearchInRotatedArray33{
    public static void main(String[] args) {
        int nums[] = {3,4,5,6,1,2};
        System.out.println(search(nums, 2));
    }
    public static int search(int[] nums, int target) {
        int l=0,r=nums.length-1,mid=0;
        if(nums[0]>nums[r]){
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
            
        
        }
        System.out.println("mid: "+mid);
        if(nums[mid]==target)
            return mid;
        if(target<=nums[nums.length-1]){
            l=mid;r=nums.length-1;
        }else{
            r=mid-1;l=0;
        }  
        System.out.println(l+" "+r );
        while(l<=r){
            mid = (r+l)/2;
            if(nums[mid]==target)
                return mid;
            else if(target>nums[mid]){
                l=mid+1;
            }else{
                r=mid-1;

            }    
        }

        return -1;
    }

    public int simple(int[] nums,int target){
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = ( start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
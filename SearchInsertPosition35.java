package leetcode;

public class SearchInsertPosition35 {

	public static void main(String[] args) {
		int arr[]= {1,3,5,6,7,9};
		System.out.println(searchInsert(arr,8));
		
	}
    public static int searchInsert(int[] nums, int target) {
        int l = 0,index=0;
        int r = nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            
        if(nums[mid]==target){
            return mid;
        }else if(target < nums[mid]){
            r=mid-1;
        }else{
            l=mid+1;
        }        
        index=mid;
        }
        return nums[index]>target?index:index+1;
    }

}

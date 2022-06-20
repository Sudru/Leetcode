
public class SingleNumber136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleNumber(new int[] {1,2,3,2,1}));
	}
	   public static int singleNumber(int[] nums) {
	        int single = nums[0];
	        for(int i= 1;i<nums.length;i++){
	            single^=nums[i];
	        }
	        return single;
	    }

}

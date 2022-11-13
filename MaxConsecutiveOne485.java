public class MaxConsecutiveOne485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0,currentCount=0;

        for(int i =0 ;i<nums.length;i++){
            if(nums[i]==0){
                if(maxCount<currentCount){
                    maxCount = currentCount;
                }
                currentCount =0;

            }else{
                currentCount++;
            }
        }
        return maxCount>currentCount?maxCount:currentCount;
    }
}

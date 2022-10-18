import java.util.HashMap;
import java.util.Map;

public class TwoSums1 {
    public static void main(String[] args) {
        int[]nums = {2,7,11,15};
        int a[] = twoSum(nums, 9);
        for(int i :a){
            System.out.print(i+",");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int solution[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null){
                solution[0]=i;
                solution[1]=map.get(nums[i]);
                break;
            }
            map.put(target-nums[i], i);
            System.out.println(map);
        }
        return solution;
    }
}

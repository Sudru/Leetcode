import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays349{
    public static void main(String[] args) {
        int [] a = intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        for(int i : a){
            System.out.println(i);
        }
        
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i< nums1.length;i++){
           map.put(nums1[i],1);
        }
        for(int i =0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                if(map.get(nums2[i])<2)
                    count++;
                map.put(nums2[i], map.get(nums2[i])+1);
            }
        }

        int[] ans = new int[count];
        int i =0;
        for(Integer key :map.keySet()){
            if(map.get(key)>=2){
                ans[i]=key;
                i++;
            }            
            
        }
        return ans;
            

        }
        //solution based on the constrains which has way less time complexity from discussion section
        public static int[] intersection2(int[]nums1,int[]nums2){
            boolean[] check = new boolean[1001]; // 0 <= nums1[i], nums2[i] <= 1000(given)
        int[] res = new int[Math.max(nums1.length,nums2.length)];
        
        for(int num: nums1)
            check[num] = true;
        
        int count = 0;
        for(int num: nums2){
            if(check[num] == true){
                res[count] = num;
                count++;
                check[num] = false;
            }
        }
        
        return Arrays.copyOf(res,count);
        }

    }

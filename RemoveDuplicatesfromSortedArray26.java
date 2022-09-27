public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int nums[] = {};
        System.out.println(removeDuplicates(nums));
        for(int i:nums){
            System.out.print(i);
        }
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int mp=0,ip=0;
        while(ip < nums.length){
            if(nums[ip]!=nums[mp]){
                nums[mp+1]=nums[ip];
                mp++;
            }
            ip++;

        }
        return mp+1;
    }
}

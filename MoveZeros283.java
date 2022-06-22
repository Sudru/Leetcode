public class MoveZeros283{
    public static void main(String[] args) {
        int [] nums=new int[]{1,0,1};
        moveZeroes(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++)
        {   
            
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        
        for(int k=j;k<n;k++)
        {
            nums[k]=0;
        }
    }
       }


public class MergeSortedArrays88 {
    public static void main(String[] args) {
        int nums1[]={0};
        int nums2[]={1};

        merge(nums1, 0, nums2, nums2.length);
        for(int i : nums1){
            System.out.print(i);
        }
        
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m];
        int p1=0,p2=0;
        for(int i=0;i<m;i++){
            temp[i]=nums1[i];
        }
        int i=0;
        while(p1<m&&p2<n){
            if(temp[p1]<nums2[p2]){
                nums1[i]=temp[p1];
                p1++;
            }else{
                nums1[i]=nums2[p2];
                p2++;
            }
            i++;
        }
        while(p1<m){
            nums1[i]=temp[p1];
            p1++;
            i++;
        }
        while(p2<n){
            nums1[i]=nums2[p2];
            p2++;
            i++;
        }

    }   
}

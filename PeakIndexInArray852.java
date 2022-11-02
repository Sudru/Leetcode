
public class PeakIndexInArray852{
	public static void main(String[] args){
		int [] arr ={3,5,3,2,0};
		System.out.println(peakIndexInMountainArray(arr));
		System.out.println(newApproach(arr));
	}
	public  static int peakIndexInMountainArray(int[] arr) {
 		int l=1,r=arr.length-2;
        while(l<=r){
        	int mid = (l+r)/2;
        	if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
        		return mid;
        	}
        	if(arr[mid]>arr[mid-1])
        		l = mid+1;
        	else
        		r=mid-1;
        }
        return -1;
    }
	public static int newApproach(int[] arr){
		int start =0,end=arr.length-1,mid;
		while(start<end){
			 mid = start + (end-start)/2;
			if(arr[mid]<arr[mid+1]){
				start = mid +1;
			}else if(arr[mid]>arr[mid+1]){
				end = mid;
			}
		}
		return start;
	}

}
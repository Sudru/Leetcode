
public class ArrangingCoins441 {

	public static void main(String[] args) {
		System.out.println(arrangeCoins(1));
	}
	  public static int arrangeCoins(int n) {
		  int count =0;
		  int i=1;
		  while(n-i>=0) {
			  n-=i;
			  i++;
			  count++;
		  }
		  return count;
	        
	    }
	    //binary search approach
	    public int arrangeCoins(int n) {
        long l=1, r=n;
        while(l<=r){
            long mid = l + (r-l)/2;
            long totalSum = mid*(mid+1)/2;
            if(totalSum == n){
                return (int)mid;
            }else if(n > totalSum){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return (int)r;
    }
}

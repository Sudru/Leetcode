package leetcode;

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

}

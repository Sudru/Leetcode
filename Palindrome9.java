
public class Palindrome9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean isPalindrome(int x) {
	        int rev =0;
	        int org = x;

	        while(x>0){
	            rev=rev*10+x%10;
	            x/=10;
	            
	        }
	        return rev==org;
	    }

}

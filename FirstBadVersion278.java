
public class FirstBadVersion278 {

	public static void main(String[] args) {
System.out.println(firstBadVersion(2126753390));
	}
	public static boolean isBadVersion(int n) {
		return n>=1702766719;
	}
	public static int firstBadVersion(int n) {
	        long l=1;
	        long r=n;
	        int mid = 1;
	        while(l<=r){
	             mid = (int) ((l+r)/2);
	            if(isBadVersion(mid)){
	                r=mid-1;
	            }else{
	                l=mid+1;
	              
	            }
	            System.out.println(mid);
	        }
	        return isBadVersion(mid)?mid:mid+1;
	    }

}

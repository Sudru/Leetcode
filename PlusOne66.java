
public class PlusOne66 {

	public static void main(String[] args) {
		int[] arr = {9,9};
		int[] added = plusOne(arr);
		for(int i:added) {
			System.out.print(i);
		}
		
	}
	public static int[] plusOne(int[] digits) {
		int carry=1;
        for(int i=digits.length-1;i>=0;i--) {
        	if(digits[i]+carry==10) {
        		digits[i]=0;
        		carry =1;
        	}else {
        		digits[i]+=carry;
        		carry =0;
        	}
        }
        if(carry==1) {
        	int ar[]= new int[digits.length+1];
        	ar[0]=1;
        	for(int i=0;i<digits.length;i++) {
        		ar[i+1]=digits[i];
        	}
        	return ar;
        	
        }
        return digits;
    }

}

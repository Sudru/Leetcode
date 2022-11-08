
public class IsPowerOfThree326{
	public static void main(String[] args){
		
	}
	public boolean isPowerOfThree(int n) {
        return is(n);
    }
    public boolean is(double n){
        if(n==1.0){
            return true;
        }else if(n<9.0 && n!=3.0){
            return false;
        }
        return is(n/3.0);
    }

}
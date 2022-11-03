public class ReverseInteger7 {
    public int reverse(int x) {
        int n = Math.abs(x);
        long sum=0;
        while(n>0){
            int rem = n%10;
            if(sum*10+rem>Integer.MAX_VALUE)
                return 0;
            sum = sum*10+rem;
            n/=10;
        }
        return x>0?(int)sum:(int)sum*-1;
    }
}

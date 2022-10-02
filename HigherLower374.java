public class HigherLower374 {
    public static void main(String[] args) {
        System.out.println(guessNumber(2126753390));
        
    }
    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        
        while(start <= end){
            int mid = start + (end - start)/2 ; 
            
            if(guess(mid) == 0){
                return mid;
            }
            else if(guess(mid) == -1){
                end = mid - 1;
            }
            else if(guess(mid) == 1){
                start = mid + 1;
            }
        }
        return -1;
    }
        
    
    public static int guess(int num){
        int a= 1702766719;
        if(num==a)
            return 0;
        return num>a?-1:1;    
        
    }
}

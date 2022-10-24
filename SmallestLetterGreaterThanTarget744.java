
public class SmallestLetterGreaterThanTarget744{
	public static void main(String[] args){
		
	}
	public char nextGreatestLetter(char[] letters, char target) {
        if(target < letters[0] || target >= letters[letters.length-1]){
            return letters[0];
        }
        int left = 0,right = letters.length-1,mid;
        while(left<=right){
            mid = (left+right)/2;
            if(letters[mid]==target && letters[mid+1]!=letters[mid]){
                return mid==letters.length-1?letters[mid]:letters[mid+1];
            }else if(letters[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return letters[left];
        
    }

}
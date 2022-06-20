
public class FindTheDifference389 {

	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "aebcd"));
		
	}
    public static char findTheDifference(String s, String t) {
    	int sCount=0,tCount=0;
    	for (int i = 0;i<s.length();i++) {
    		sCount+=s.charAt(i);
    		tCount+=t.charAt(i);
    	}    	
    	tCount+=t.charAt(t.length()-1);
    	return (char)(tCount-sCount);
    }

}

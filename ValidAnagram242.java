
public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("aacc", "ccac"));
        
        
    }
    public static boolean isAnagram(String s, String t) {
        int charInt[] = new int[26];
        if(s.length() != t.length())
            return false;
        
        for(int i=0;i<s.length();i++){
            int pos = s.charAt(i)-97;
            charInt[pos]+=1;
        }
        
        for(int i=0;i<t.length();i++){
            int pos = t.charAt(i)-97;
            if(charInt[pos]==0){
                return false;
            }else{
                charInt[pos]-=1;
            }
        }
        return true;
        
    }
}

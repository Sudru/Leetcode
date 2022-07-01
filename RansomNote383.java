
public class RansomNote383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "ab"));
        
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length())
            return false;
            int[] charArray = new int[26];
        
        for(int i = 0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            
            charArray[c-97] = charArray[c-97]+1; 
        }
        for(int i = 0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(charArray[c-97]>0){
                charArray[c-97]-=1;
            }else{
                return false;
            }
        }
        
        return true;
    }
}


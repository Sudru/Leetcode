public class FirstUniqueCharacter387{
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {
        int charArray[] = new int[26];
        for(int i=0;i<s.length();i++){
            charArray[s.charAt(i)-97]++;
        }
        for(int i=0;i<s.length();i++){
            if(charArray[s.charAt(i)-97]==1){
                return i;
            }
        }
        
        return -1;
    }
}
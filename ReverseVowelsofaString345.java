public class ReverseVowelsofaString345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int l=0,r=s.length()-1;
        
        while(l<r){
           while(l<r){
            char c =Character.toLowerCase(str.charAt(l));
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                break;
            }else{
                l++;
            }

           }
           while(l<r){
                char cr = Character.toLowerCase(str.charAt(r));
                if(cr=='a'|| cr=='e' || cr=='i' || cr=='o' || cr=='u'){
                    break;
                }else{
                    r--;
                }
           }
           char temp = str.charAt(l);
           str.setCharAt(l,str.charAt(r));
           str.setCharAt(r, temp);
           r--;
           l++;


        }
        return str.toString();
    }
}

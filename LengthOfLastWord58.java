
public class LengthOfLastWord58 {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello"));
	}
	 public static int lengthOfLastWord(String s) {
		 String str[] = s.strip().split(" ");
		 return str[str.length-1].strip().length();
	  }

}

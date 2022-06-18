package leetcode;

public class ExcelSheetColumnTitle168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(16901));
	}
	public static String convertToTitle(int columnNumber) {
		StringBuilder string = new StringBuilder();
		while(columnNumber>26) {
			int num = columnNumber%26;
			if(num ==0) {
				string.append("Z");
				columnNumber = columnNumber/26-1;
			}else {
				string.append((char)(num+64));
				columnNumber/=26;
			}
						
		}
		string.append((char)(columnNumber+64));
	
		return string.reverse().toString();
    }

}

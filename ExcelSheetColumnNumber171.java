package leetcode;

public class ExcelSheetColumnNumber171 {

	public static void main(String[] args) {
		System.out.println(titleToNumber("ZY"));
		
	}
	 public static int titleToNumber(String columnTitle) {
		 int length = columnTitle.length()-1;
		 int columnNumber = 0;
		 for(int i = length;i>=0;i--) {
			 columnNumber+=Math.pow(26, length-i)*(columnTitle.charAt(i)-64);
		 }
	        
		 return columnNumber;
	    }

}

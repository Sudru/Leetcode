package leetcode;



public class LongestCommonPrefix14 {

	public static void main(String[] args) {
		
		String [] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
		
	}	
		//my solution
	   public static String longestCommonPrefix(String[] strs) {
		   StringBuilder longest= new StringBuilder();
		   for(int i=0;i<strs[0].length();i++) {
			 
			  char c = strs[0].charAt(i);
			  for(String str:strs) {
				  if(i>str.length()-1) 
					  return longest.toString();					  
				char temp = str.charAt(i);
				if(temp!= c)
					return longest.toString();
				  
			  }
			  longest.append(c);
		  
		   }
			  return longest.toString();

		   }
	   
	   //from solution section
	   public static String longestCommonPrefix1(String[] strs) {
		    if (strs == null || strs.length == 0) return "";
		    for (int i = 0; i < strs[0].length() ; i++){
		        char c = strs[0].charAt(i);
		        for (int j = 1; j < strs.length; j ++) {
		            if (i == strs[j].length() || strs[j].charAt(i) != c)
		                return strs[0].substring(0, i);             
		        }
		    }
		    return strs[0];
		}
}

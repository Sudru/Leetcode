public class StudentAttendenceRecord551 {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        
    }
    public static boolean checkRecord(String s) {
        int absCount =0;
        for (int i =0;i<s.length();i++){
            if(s.charAt(i)=='A')
                absCount++;
            if(absCount==2)
                return false;
            if(i>=2){
                if(s.charAt(i-2)=='L'&&s.charAt(i-1)=='L'&&s.charAt(i)=='L')
                    return false;
            }    
                 
        }
        return true;
    }
}

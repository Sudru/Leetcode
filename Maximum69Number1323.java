public class Maximum69Number1323 {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
        
    }
    public static int maximum69Number (int num) {
        String a = String.valueOf(num);
        StringBuilder s = new StringBuilder();
        int i=0;
        while(i<a.length() && a.charAt(i)=='9'){
            s.append(a.charAt(i));
            i++;
        }
        if(i<a.length()){
            s.append('9');
            i++;
        }
        while(i<a.length()){
            s.append(a.charAt(i));
            i++;
        }
       return Integer.valueOf(s.toString());
    }

}

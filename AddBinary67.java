public class AddBinary67 {
    public static void main(String[] args) {
        System.out.println(addBinary("0", "0"));
        // System.out.println(0^1^0);        
    }
    public static String addBinary(String a, String b) {
        int ai = a.length()-1;
        int bi = b.length()-1;
        int x,y,c=0,s,i=0;
        StringBuilder sb = new StringBuilder();
        while(ai-i>=0 && bi-i>=0){
            x = a.charAt(ai-i)=='1'?1:0;
            y = b.charAt(bi-i)=='1'?1:0;
            // System.out.println("x: "+x+" y: "+y);
            s= x^y^c;
            // System.out.println(s);
            sb.append(s);
            if(x+y+c>1){
                c=1;
            }else{
                c=0;
            }

            i++;
        }
        ai-=i;
        bi-=i;
        while(ai>=0){
            x = a.charAt(ai)=='1'?1:0;
            s = x^c;
            sb.append(s);
            if(x+c>1){
                c=1;
            }else{
                c=0;
            }
            ai--;

        }
        while(bi>=0){
            y = b.charAt(bi)=='1'?1:0;
            s = y^c;
            sb.append(s);
            if(y+c>1){
                c=1;
            }else{
                c=0;
            }
            bi--;

        }
        sb.append(c==1?1:"");


        return sb.reverse().toString();
    }
}

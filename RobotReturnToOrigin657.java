public class RobotReturnToOrigin657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UDUDUDLRLR"));
    }
    public static boolean judgeCircle(String moves) {
        int xMove =0,yMove =0;
        for (int i =0;i<moves.length();i++){
            char c = moves.charAt(i);
            if(c=='U')
                yMove++;
            else if(c=='D')
                yMove--;
            else if(c=='L')
                xMove--;
            else
                xMove++;
        }
        if(xMove==0 && yMove==0){
            return true;
        }
        return false;
    }
}


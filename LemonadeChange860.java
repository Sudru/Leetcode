
public class LemonadeChange860 {

    public static void main(String[] args) {
        int bills[] ={5,5,10,10,20};
        System.out.println(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
        int[] moneyBox = new int[2];
        int bill=0;
        for(int i=0;i<bills.length;i++){
            bill = bills[i];
            if(bill==5) moneyBox[0]++;
            else if(bill==10) moneyBox[1]++;
            bill-=5;
            if(bill==5){
                if(moneyBox[0]>0)
                moneyBox[0]--;
                else
                return false;
            }else if(bill==15){
                if(moneyBox[1]>0 && moneyBox[0]>0){
                    moneyBox[1]--;
                    moneyBox[0]--;
                }
                else if(moneyBox[0]>=3)
                    moneyBox[0]-=3;
                else return false;
            }

        }
        
        return true;
    }
}

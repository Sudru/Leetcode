import java.util.Map;
import java.util.HashMap;
public class DistributeCandies575{
    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1,2,3,4}));
    }
    public static int distributeCandies(int[] candyType) {
        Map<Integer,Integer> map = new HashMap<>();
        int size = candyType.length/2;
        int count =0,i=0;
        while(count<size && i<size*2){
                if(!map.containsKey(candyType[i])){
                    map.put(candyType[i],1);
                    count++;
                }
                i++;
        }
        return  count;

    }
}
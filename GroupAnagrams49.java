import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
        
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        String a;
        for(int i=0;i<strs.length;i++){
            
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            a = new String(c);
            
            if(map.containsKey(a)){
                map.get(a).add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(a, list);
            }
        }
        System.out.println(map);
        for(List<String> lst:map.values()){
            ans.add(lst);
        }
        return ans;
    }
}

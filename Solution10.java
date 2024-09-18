import java.util.*;
public class Solution10 {
    public static void main(String[] args) {
        String[] s={"eat", "tea", "tan", "ate", "nat", "bat"};
        ArrayList<ArrayList<String>> a1=new ArrayList<>();
        a1=anargam(s);
        Collections.reverse(a1);
        System.out.print(a1);
    }
    public static ArrayList<ArrayList<String>> anargam(String[] s){
        ArrayList<Integer> a1=new ArrayList<>();
        HashMap<Integer,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<s.length;i++){
            int value=0;
            for(int j=0;j<s[i].length();j++){
                value=(int)s[i].charAt(j)+value;
            }
            if(map.containsKey(value)!=true){
                map.put(value,new ArrayList<String>());
            }
            map.get(value).add(s[i]);
        }
        return new ArrayList<>(map.values());
    }
}

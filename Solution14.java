import java.util.*;
public class Solution14 {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(check(s));
    }
    public static int check(String value){
        HashMap<Character,Integer> map=new HashMap<>();
        Set<Character> s1=new HashSet<Character>();
        int answer=0;
        for(int i=0;i<value.length();i++){
            if(map.containsKey(value.charAt(i))!=true){
                map.put(value.charAt(i),i);
            }
            else{
                i=map.get(value.charAt(i));
                map.clear();
            }
            if(map.size()>answer){
                answer=map.size();
                s1=map.keySet();
            }
        }
        return answer;
    }
}

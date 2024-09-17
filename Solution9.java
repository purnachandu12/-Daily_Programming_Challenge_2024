import java.util.*;
public class Solution9 {
    public static void main(String[] args) {
        String[] q={"dog", "racecar", "car"};
        System.out.println(prefix(q));
    }
    public static String prefix(String[] arr){
        Arrays.sort(arr);
        String value="";
        for(int i=0;i<arr[arr.length-1].length();i++){
            if(arr[0].charAt(i)==arr[arr.length-1].charAt(i)){
                value=value+arr[0].charAt(i);
            }
            else{
                break;
            }
        }
        return value;
    }
}

import java.util.*;
public class Solution6 {
    public static void main(String[] args) {
        int[] arr={4,-1,-3,1,2,-1};
        ArrayList<ArrayList<Integer>>a1=new ArrayList<>();
        a1=check(arr);
    }
    public static ArrayList<ArrayList<Integer>> check(int[] arr){
        ArrayList<ArrayList<Integer>> a1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==0){
                    ArrayList<Integer> a2=new ArrayList<>();
                    a2.add(i);
                    a2.add(j);
                    a1.add(a2);
                }
            }
        }
        System.out.println(a1);
        return a1;
    }
}

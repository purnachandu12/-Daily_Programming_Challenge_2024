import java.util.*;
public class Solution5 {
    public static void main(String[] args) {
        int[] arr={100,50,20,10};
        int[] result=sort(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] sort(int[] arr){
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                a1.add(arr[i]);
            }
        }
        int[] result=new int[a1.size()];
        for(int i=0;i<a1.size();i++){
            result[i]=a1.get(i);
        }
        return result;
    }
}

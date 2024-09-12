import java.util.*;
public class Solution4 {
    public static void main(String[] args) {
        int[] arr1={2};
        int[] arr2={1,3};
        merge(arr1,arr2);
    }
    public static void merge(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        while(i<arr1.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                Arrays.sort(arr2);
            }
        }
        for(int k=0;k<arr1.length;k++){
            System.out.print(arr1[k]+" ");
        }
        System.out.println(" ");
        for(int m=0;m<arr2.length;m++){
            System.out.print(arr2[m]+" ");
        }
    }
}

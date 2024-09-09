public class Solution1{
    public static void main(String[] args) {
        int[] arr={2,2,2,2,2,2};
        int zeros=0;
        int ones=0;
        int twos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;
            }
            else if(arr[i]==1){
                ones++;
            }
            else{
                twos++;
            }
        }
        int k=0;
        for(int i=0;i<zeros;i++){
            arr[k]=0;
            k++;
        }
        for(int i=0;i<ones;i++){
            arr[k]=1;
            k++;
        }
        for(int i=0;i<twos;i++){
            arr[k]=2;
            k++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
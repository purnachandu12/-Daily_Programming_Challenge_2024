public class Solution3 {
    public static void main(String[] args) {
        int[] arr={3,1,3,4,2};
        System.out.println(duplicate(arr));
    }
    public static int duplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}

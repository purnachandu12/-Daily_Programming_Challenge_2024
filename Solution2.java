public class Solution2 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        System.out.print(find(arr));
    }
    public static int find(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(i!=arr[i-1]){
                return i;
            }
        }
        return 0;
    }
}

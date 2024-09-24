public class Solution16 {
    public static void main(String[] args) {
        System.out.println(lcm(2,3));
    }
    public static int lcm(int n,int m){
        int max=Math.max(n, m);
        while(true){
            if(max%n==0 && max%m==0){
                return max;
            }
            else{
                max++;
            }
        }
    }
}

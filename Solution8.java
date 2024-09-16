public class Solution8 {
    public static void main(String[] args) {
        String word="the sky is blue";
        reverse(word);
    }
    public static void reverse(String word){
        String value="";
        String[] arr=word.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            value=value+arr[i]+" ";
        }
        System.out.println(value.trim());
    }
}

public class Solution11 {
    public static void main(String[] args) {
        String s="abc";
        per("",s);   
    }
    public static void per(String p,String up){
        if(up.isEmpty()==true){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            per( f+ch+s,up.substring(1));
        }
    }
}


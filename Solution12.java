import java.util.*;
public class Solution12 {
    public static void main(String[] args) {
        String s= "[{()}]";
        System.out.println(check(s));
    }
    public static boolean check(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else if(stack.isEmpty()!=true && s.charAt(i)=='}'){
                if(stack.peek()=='{'){
                    stack.pop();
                }
            }
            else if(stack.isEmpty()!=true && s.charAt(i)==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }
            }
            else if(stack.isEmpty()!=true && s.charAt(i)==']'){
                if(stack.peek()=='['){
                    stack.pop();
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()==true){
            return true;
        }
        else{
            return false;
        }
    }
}

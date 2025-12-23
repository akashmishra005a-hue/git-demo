package StacksDtataStructure;
import java.util.*;
public class balancedBracket {
    public static boolean  isBalanced(String str){
   Stack<Character> st = new Stack<>();
       for(int i =0;i<str.length();i++){
           char a = str.charAt(i);
           if(a=='(') st.push(a);
           else{
               if(st.size()==0) return false;
               if(st.size()>0) st.pop();
           }
       }
       if(st.isEmpty()) return true;
       return false;
    }

    public static void main(String[] args) {
        String str = "()()()((";
        System.out.println(isBalanced(str));
    }
}

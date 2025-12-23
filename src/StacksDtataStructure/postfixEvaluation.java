package StacksDtataStructure;

import java.util.Stack;

public class postfixEvaluation {
    public static void main(String[] args) {
       String postfix = "953+4*6/-";
       Stack<Integer> st = new Stack<>();
       for(int i =0;i<postfix.length();i++){
           char ch = postfix.charAt(i);
           int asci = (int)ch;
           if(asci>=48&&asci<=57) st.push(asci-48);
           else{
               int val2 = st.pop();
               int val1 = st.pop();
               if(ch=='+') st.push(val1+val2);
               if(ch=='-') st.push(val1-val2);
               if(ch=='*') st.push(val1*val2);
               if(ch=='/') st.push(val1/val2);
           }
       }
       int ans = st.pop();
        System.out.println("postfix evalutaion is "+ans);
    }
}

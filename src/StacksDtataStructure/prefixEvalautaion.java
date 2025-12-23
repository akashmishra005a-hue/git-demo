package StacksDtataStructure;

import java.util.Stack;

public class prefixEvalautaion {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        Stack<Integer>st = new Stack<>();
        for(int i = prefix.length()-1;i>=0;i--){
            char ch = prefix.charAt(i);
            int asci = (int)ch;
            if(asci>=48&&asci<=57) st.push(asci-48);
            else{
                int val1 = st.pop();
                int val2 = st.pop();
                if(ch=='+') st.push(val1+val2);
                if(ch=='-') st.push(val1-val2);
                if(ch=='*') st.push(val1*val2);
                if(ch=='/') st.push(val1/val2);
            }
        }
        int ans = st.pop();
        System.out.println("prefixevaluation is "+ans);
    }
}

package StacksDtataStructure;

import java.util.Stack;

public class postfix_to_infix{
    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i =0;i<postfix.length();i++){
            char ch = postfix.charAt(i);
            int asci = (int)ch;
            if(asci>=48&&asci<=57) val.push(String.valueOf(asci-48));
            else{
                String s2 = val.pop();
                String s1 = val.pop();
                val.push(s1+ch+s2);
            }
        }
        String infix = val.pop();
        System.out.println(infix);
    }
}
